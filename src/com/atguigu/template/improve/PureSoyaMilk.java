package com.atguigu.template.improve;

public class PureSoyaMilk extends SoyaMilk{

	@Override
	void select() {
		System.out.println("Override the select method ");
		super.select();
	}

	@Override
	void addCondiments() {
		//��ʵ��  ����ʵ��
	}


	@Override
	boolean customerWantCondiments() {
		// TODO Auto-generated method stub
		return false; // �ж��Ƿ�Ҫ��������
	}

}
