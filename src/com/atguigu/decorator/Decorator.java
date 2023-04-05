package com.atguigu.decorator;

public class Decorator extends Drink {
	private Drink obj; // 被装饰者

	public Decorator(Drink obj) { //组合
		this.obj = obj;
	}

	@Override
	public float cost() {
		// getPrice 自己价格 + 被装饰者的价格
		return super.getPrice() + obj.cost();
	}

	@Override
	public String getDes() {
		// obj.getDes() 输出被装饰者的信息
//		return super.getDes() + " " + super.getPrice() + " && " + obj.getDes() + " " + obj.cost();
		return super.getDes() +   " && " + obj.getDes() ;
	}

}
