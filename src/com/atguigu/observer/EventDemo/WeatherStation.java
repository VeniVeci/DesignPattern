package com.atguigu.observer.EventDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WeatherStation implements EventSource {

    List<EventListener> listeners = new LinkedList<EventListener>();
    WeatherData data = new WeatherData();

    @Override
    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(EventListener e) {
        listeners.remove(e);
    }

    public void monitor() {
        System.out.println("\n*************** Weather Station is Working... *******************");
        System.out.println("Enter \"exit\" to Exit");
        System.out.println("Enter \"[temperature] [humidity] [pressure]\" to Fill Weather Datas");
        System.out.println("*******************************************************************\n");
        monitor(new Scanner(System.in));
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
            // 生成事件
            Event e = getEvent(data.getTemperatureVar(temperature), data.getHumidityVar(humidity), data.getPressureVar(pressure));
            // 更新 三个指标 到总站的数据面板
            data.update(temperature, humidity, pressure);
            // 把这个数据变动 交给事件监听者   属于
            dispatch(e);
        }
    }

    private Event getEvent(int temperatureVar, int humidityVar, int pressureVar) {
        return new WeatherDataChangeEvent(temperatureVar, humidityVar, pressureVar);
    }

    private void dispatch(Event e) {
        for(EventListener listener : listeners) {
            listener.notifyEvent(e);
        }
    }
}
