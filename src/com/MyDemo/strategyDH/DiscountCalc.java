package com.MyDemo.strategyDH;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description:
 * @date: 2023/11/19
 */
public class DiscountCalc extends Calc{

    double discount;

    public DiscountCalc(double discount) {
        this.discount = discount;
    }

    @Override
    public double calcPrice(int price, int num) {
        sumPrice = price*num*discount;
        printPrice();
        return sumPrice;
    }
}
