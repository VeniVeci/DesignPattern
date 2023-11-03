package com.MyDemo.strategy;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description:
 * @date: 2023/11/3
 */
class LongWheelCar extends car{
    public LongWheelCar(BrakeBehavior behavior){
        this.wheel = behavior;
    }
}
