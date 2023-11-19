package com.MyDemo.strategyDH;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description:
 * @date: 2023/11/19
 */
public class ReductionCalc implements Calc{

    int sheld;
    int reducePrice;
    @Override
    public double calcPrice(int price, int num) {
        double sumPrice = price*num;
        if(sumPrice >= sheld){
            sumPrice -= reducePrice;
        }
        return sumPrice;
    }
}
