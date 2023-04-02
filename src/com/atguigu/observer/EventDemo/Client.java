package com.atguigu.observer.EventDemo;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PressureListener pressureListener = new PressureListener();
        weatherStation.addListener(pressureListener);
        weatherStation.addListener(new TemperatureListener());

        weatherStation.addListener(new HumidityListener());

        weatherStation.monitor();

    }
}
