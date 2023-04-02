package com.atguigu.strategy.improve;

import org.junit.Test;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildDuck wildDuck = new WildDuck();
		// 新建对象的时候  就把相关的 behavior set进去了  在调用某个方法的时候
		// 就进行 调用即可
		wildDuck.fly();//

		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();

		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();

		//动态改变某个对象的行为, 北京鸭 不能飞
		pekingDuck.setFlyBehavior(new NoFlyBehavior());
//		System.out.println("北京鸭的实际飞翔能力");
		pekingDuck.fly();

	}
	@Test
	public void test(){
		ToyDuck duck = new ToyDuck();
		duck.setQuackBehavior(() -> {
			System.out.println("buhuijiao");
		});
		duck.quack2();
	}

}
