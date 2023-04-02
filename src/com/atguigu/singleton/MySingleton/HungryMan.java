package com.atguigu.singleton.MySingleton;



/**
 * @Description
 * @create 2022/3/22 - 16:53
 */
public class HungryMan {

    private HungryMan(){

    }
    private static final HungryMan HUNGRY_MAN = new HungryMan();

    public static HungryMan getInstance(){
        return HUNGRY_MAN;
    }
}
