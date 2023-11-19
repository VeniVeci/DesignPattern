package com.MyDemo.strategyDH;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description:
 * @date: 2023/11/19
 */
public class ReductionCalc extends Calc{

    int sheld;
    int reducePrice;

    public ReductionCalc(int sheld, int reducePrice) {
        this.sheld = sheld;
        this.reducePrice = reducePrice;
    }

    @Override
    public double calcPrice(int price, int num) {
        sumPrice = price*num;
        if(sumPrice >= sheld){
            sumPrice -= reducePrice;
        }
        printPrice();
        return sumPrice;
    }
}
