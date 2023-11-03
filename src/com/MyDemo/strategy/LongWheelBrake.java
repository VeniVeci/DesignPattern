package com.MyDemo.strategy;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description:
 * @date: 2023/11/3
 */
class LongWheelBrake implements BrakeBehavior{

    @Override
    public void stop() {
        System.out.println("LongWheelBrake  brake");
    }
}
