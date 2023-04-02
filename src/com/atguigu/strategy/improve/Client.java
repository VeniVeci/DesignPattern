package com.atguigu.strategy.improve;

import org.junit.Test;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildDuck wildDuck = new WildDuck();
		// �½������ʱ��  �Ͱ���ص� behavior set��ȥ��  �ڵ���ĳ��������ʱ��
		// �ͽ��� ���ü���
		wildDuck.fly();//

		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();

		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();

		//��̬�ı�ĳ���������Ϊ, ����Ѽ ���ܷ�
		pekingDuck.setFlyBehavior(new NoFlyBehavior());
//		System.out.println("����Ѽ��ʵ�ʷ�������");
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
