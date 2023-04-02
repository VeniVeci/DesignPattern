package com.atguigu.observer.EventDemo;

public class HumidityListener implements EventListener {
    private int humidity = 0;
    @Override
    public void notifyEvent(Event e) {
        int humidityVar = ((WeatherDataChangeEvent)e).getHuminityVar();
        humidity += humidityVar;
        System.out.printf("  |- humidity[diff=%d] = %d\n", humidityVar, humidity);
    }
}
