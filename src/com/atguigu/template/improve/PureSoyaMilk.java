package com.atguigu.template.improve;

public class PureSoyaMilk extends SoyaMilk{

	@Override
	void select() {
		System.out.println("Override the select method ");
		super.select();
	}

	@Override
	void addCondiments() {
		//空实现  必须实现
	}


	@Override
	boolean customerWantCondiments() {
		// TODO Auto-generated method stub
		return false; // 判断是否要加入配料
	}

}
