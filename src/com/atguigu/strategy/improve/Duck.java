package com.atguigu.strategy.improve;

public abstract class Duck {

	//����, ���Խӿ�
	FlyBehavior flyBehavior;
	//��������<->���Խӿ�
	QuackBehavior quackBehavior;

	public Duck() {

	}

	public abstract void display();//��ʾѼ����Ϣ

	public void quack() {
		System.out.println("Ѽ�ӽ�~~");
	}
	public void quack2() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("Ѽ�ӻ���Ӿ~~");
	}

	public void fly() {
		//�Ľ�
		if(flyBehavior != null) {
			flyBehavior.fly();
		}
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}


	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}



}
