package com.atguigu.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {

		AbsAdapter absAdapter = new AbsAdapter() {
			//ֻ��Ҫȥ�������� ��Ҫʹ�� �ӿڷ���
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("ʹ����m1�ķ���");
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
