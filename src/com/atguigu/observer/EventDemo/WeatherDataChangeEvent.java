package com.atguigu.observer.EventDemo;

public class WeatherDataChangeEvent implements Event{
    private final int temperatureVar;
    private final int humidityVar;
    private final int pressureVar;

    public WeatherDataChangeEvent(int tempVar, int humVar, int pressVar) {
        this.temperatureVar = tempVar;
        this.humidityVar = humVar;
        this.pressureVar = pressVar;
    }

    public int getTemperatureVar() {
        return temperatureVar;
    }

    public int getHuminityVar() {
        return humidityVar;
    }

    public int getPressureVar() {
        return pressureVar;
    }

}
