package com.MyDemo.strategyDH;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description:
 * @date: 2023/11/19
 */
public class DiscountCalc implements Calc{

    int discount;
    @Override
    public double calcPrice(int price, int num) {
        return price*num*discount;
    }
}
