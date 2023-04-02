package com.atguigu.observer.EventDemo;

public class WeatherData {
    private int temperature = 0;
    private int humidity = 0;
    private int pressure = 0;

    public WeatherData() {

    }
    public void update(int temperary, int humidity, int pressure) {
        this.temperature = temperary;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    public WeatherData(int temperary, int humidity, int pressure) {
        this.temperature = temperary;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public boolean equals(int temperature, int humidity, int pressure) {
        return (this.temperature == temperature) && (this.humidity == humidity) && (this.pressure == pressure);
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumiDity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public int getTemperatureVar(int temperature) {
        return temperature - this.temperature;
    }

    public int getHumidityVar(int humidity) {
        return humidity - this.humidity;
    }

    public int getPressureVar(int pressure) {
        return pressure - this.pressure;
    }


}
