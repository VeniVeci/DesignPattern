package com.atguigu.decorator;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj); // 把 被装饰者 （一种饮料）放在里面  同时加入牛奶
		// TODO Auto-generated constructor stub
		setDes("牛奶");
		setPrice(2.0f);
	}

}
