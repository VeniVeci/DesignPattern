package com.atguigu.proxy.dynamic;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Ŀ�����
		ITeacherDao target = new TeacherDao();

		//��Ŀ����󣬴����������, ����ת�� ITeacherDao
		ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
		System.out.println("proxyInstance=" + proxyInstance);
		// proxyInstance=class com.sun.proxy.$Proxy0 �ڴ��ж�̬�����˴������
		System.out.println("proxyInstance=" + proxyInstance.getClass());
		System.out.println("target=" + target.getClass());

		//ͨ��������󣬵���Ŀ�����ķ���
		//proxyInstance.teach();

		proxyInstance.sayHello(" tom ");
	}


	@Test
	public void test(){
		ITeacherDao target = new TeacherDao();
		ITeacherDao proxyInstance = (ITeacherDao)Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("JDK����ʼ~~");
						//������Ƶ���Ŀ�����ķ���
						Object returnVal = method.invoke(target, args);
						System.out.println("JDK�����ύ");
						return returnVal;
					}
				});

		proxyInstance.sayHello("kiki");
	}

}
