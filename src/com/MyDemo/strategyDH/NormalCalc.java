package com.MyDemo.strategyDH;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description:
 * @date: 2023/11/19
 */
public class NormalCalc extends Calc{

    public NormalCalc() {
    }

    @Override
    public double calcPrice(int price, int num) {
        sumPrice = price*num;
        printPrice();
        return price*num;
    }
}
