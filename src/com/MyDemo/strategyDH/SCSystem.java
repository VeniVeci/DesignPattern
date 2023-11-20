package com.MyDemo.strategyDH;

public class SCSystem {

    public static void main(String[] args) {
        int price = 200;
        int num = 3;
        String text1 = "无折扣";
        String text2 = "打3折";
        String text3 = "满300减30";

        // 工厂模式：
//        Calc calc = CashFactory.createCalc(text1);
//        calc.calcPrice(price, num);
//        Calc calc2 = CashFactory.createCalc(text2);
//        calc2.calcPrice(price, num);
//        Calc calc3 = CashFactory.createCalc(text3);
//        calc3.calcPrice(price, num);
        //进一步解耦
        CashContext cashContext = new CashContext(text1);
        cashContext.getRes(price, num);
        CashContext cashContext2 = new CashContext(text2);
        cashContext2.getRes(price, num);
        CashContext cashContext3 = new CashContext(text3);
        cashContext3.getRes(price, num);
//
//        double discount = 0.6;
//
//        Calc calc = new DiscountCalc(discount);
//        double sumPrice = calc.calcPrice(price, num);
//        System.out.println(sumPrice);
//
//        Calc calc2 = new ReductionCalc(300,20);
//        double sumPrice2 = calc2.calcPrice(price, num);
//        System.out.println(sumPrice2);
//        double sumPrice = calc(price, num);
//        System.out.println(sumPrice);
    }


    public static double calc(int price, int num){
        double sumPrice = price*num;
        return sumPrice;
    }
}
