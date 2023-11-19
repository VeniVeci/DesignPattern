package com.MyDemo.strategyDH;

public class SCSystem {

    public static void main(String[] args) {
        int price = 50;
        int num = 3;
        double sumPrice = calc(price, num);
        System.out.println(sumPrice);
    }


    public static double calc(int price, int num){
        double sumPrice = price*num;
        return sumPrice;
    }
}
