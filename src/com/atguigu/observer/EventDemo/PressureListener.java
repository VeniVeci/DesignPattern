package com.atguigu.observer.EventDemo;

public class PressureListener implements EventListener {
    private int pressure = 0;
    @Override
    public void notifyEvent(Event e) {
        int pressureVar = ((WeatherDataChangeEvent)e).getPressureVar();
        pressure += pressureVar;
        System.out.printf("  |- pressure[diff=%d] = %d\n", pressureVar, pressure);
    }

}
