package com.MyDemo.strategyDH;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description:
 * @date: 2023/11/20
 */
public class CashContext {
    Calc calc;

    public CashContext(String type) {
        if("无折扣".equals(type)){
            calc = new NormalCalc();
        }else if(type.startsWith("满")){
            int[] numbers = extractNumbers(type);
            calc = new ReductionCalc(numbers[0], numbers[1]);
        }else if(type.startsWith("打")){
            calc = new DiscountCalc(Double.parseDouble(type.substring(1,2))/10);
        }
    }

    public double getRes(int price,int num){
//        this.calc.printPrice();
        return this.calc.calcPrice(price, num);
    }
    private static int[] extractNumbers(String input) {

        int[] numbers = new int[2];
        String pattern = "(\\d+)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);

        int index = 0;
        while (m.find() && index < 2) {
            numbers[index] = Integer.parseInt(m.group(1));
            index++;
        }

        return numbers;
    }
}
