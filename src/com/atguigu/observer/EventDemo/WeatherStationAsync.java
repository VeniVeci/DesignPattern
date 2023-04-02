package com.atguigu.observer.EventDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class WeatherStationAsync implements EventSource{
    List<EventListener> listeners = new LinkedList<EventListener>();
    List<Event> events =new LinkedList<Event>();
    WeatherData data = new WeatherData();

    @Override
    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(EventListener listener) {
        listeners.remove(listener);
    }

    public void monitor() {
        System.out.println("\n*************** Weather Station is Working... *******************");
        System.out.println("Enter \"exit\" to Exit");
        System.out.println("Enter \"[temperature] [humidity] [pressure]\" to Fill Weather Datas");
        System.out.println("*******************************************************************\n");
        Scanner sc = new Scanner(System.in);
        new Thread(() -> monitor(sc)).start();;
        new Thread(() -> dispatch()).start();;
    }

    private void monitor(Scanner sc) {
        while(true) {
            if(sc.hasNext("exit"))
            {
                System.out.println("Weather Station exited!!!");
                System.exit(0);
            }
            updateMeasurement(sc.nextInt(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }
    }

    private void updateMeasurement(int temperature, int humidity, int pressure) {
        if(!data.equals(temperature, humidity, pressure)) {
            Event e = getEvent(data.getTemperatureVar(temperature), data.getHumidityVar(humidity), data.getPressureVar(pressure));
            data.update(temperature, humidity, pressure);
            stashEvent(e);
        }
    }

    private Event getEvent(int temperatureVar, int humidityVar, int pressureVar) {
        return new WeatherDataChangeEvent(temperatureVar, humidityVar, pressureVar);
    }

    private void stashEvent(Event e) {
        synchronized(events) {
            System.out.println("[+++] Stash Event To Event List...");
            events.add(e);
            events.notify();
        }
    }

    private void dispatch() {
        Event event;
        while(true) {
            synchronized(events) {
                while(events.isEmpty()) {
                    try {
                        events.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n[---] Remove Event From Event List...");
                event = events.iterator().next();
                events.remove(event);
            }
            dispatch(event);
        }
    }

    private void dispatch(Event e) {
        for(EventListener listener : listeners) {
            listener.notifyEvent(e);
        }
    }

}
