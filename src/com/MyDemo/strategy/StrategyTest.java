package com.MyDemo.strategy;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description:
 * @date: 2023/11/3
 */
public class StrategyTest {








    public static void main(String[] args) {
        BrakeBehavior behavior = new LongWheelBrake();
        LongWheelCar car = new LongWheelCar(behavior);
        car.brake();
    }
}
