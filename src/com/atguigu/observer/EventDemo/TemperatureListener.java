package com.atguigu.observer.EventDemo;

public class TemperatureListener implements EventListener {
    private int temperatrue = 0;
    @Override
    public void notifyEvent(Event e) {
        int temperatrueVar = ((WeatherDataChangeEvent)e).getTemperatureVar();
        temperatrue += temperatrueVar;
        System.out.printf("  |- temperatrue[diff=%d] = %d\n", temperatrueVar, temperatrue);
    }

}
