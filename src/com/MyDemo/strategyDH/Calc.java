package com.MyDemo.strategyDH;

abstract class Calc {
    double sumPrice;
    abstract double calcPrice(int price, int num);
    public void printPrice(){
        System.out.println("�ܼ۸�Ϊ: " + sumPrice);
    }
}
