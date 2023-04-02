package com.atguigu.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {

		AbsAdapter absAdapter = new AbsAdapter() {
			//只需要去覆盖我们 需要使用 接口方法
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("使用了m1的方法");
			}
		};

		absAdapter.m1();

		Interface4 interface4 = new Interface4() {
			@Override
			public void m1() {
				System.out.println("gnbit");
			}

			@Override
			public void m2() {

			}

			@Override
			public void m3() {

			}

			@Override
			public void m4() {

			}
		};
		interface4.m1();
	}
}
