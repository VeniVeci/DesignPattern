package com.MyDemo.strategyDH;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description:
 * @date: 2023/11/19
 */
public class CashFactory {
    public static Calc createCalc(String type){
        Calc calc = null;
        if("ÎÞÕÛ¿Û".equals(type)){
            calc = new NormalCalc();
        }else if(type.startsWith("Âú")){
            int[] numbers = extractNumbers(type);
            calc = new ReductionCalc(numbers[0], numbers[1]);
        }else if(type.startsWith("´ò")){
            calc = new DiscountCalc(Double.parseDouble(type.substring(1,2))/10);
        }
        return calc;

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
