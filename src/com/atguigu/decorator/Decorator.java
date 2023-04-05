package com.atguigu.decorator;

public class Decorator extends Drink {
	private Drink obj; // ��װ����

	public Decorator(Drink obj) { //���
		this.obj = obj;
	}

	@Override
	public float cost() {
		// getPrice �Լ��۸� + ��װ���ߵļ۸�
		return super.getPrice() + obj.cost();
	}

	@Override
	public String getDes() {
		// obj.getDes() �����װ���ߵ���Ϣ
//		return super.getDes() + " " + super.getPrice() + " && " + obj.getDes() + " " + obj.cost();
		return super.getDes() +   " && " + obj.getDes() ;
	}

}
