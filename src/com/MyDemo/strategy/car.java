package com.MyDemo.strategy;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description:
 * @date: 2023/11/3
 */
abstract class car{
    protected BrakeBehavior wheel;
    public void brake(){
        this.wheel.stop();
    }
}
