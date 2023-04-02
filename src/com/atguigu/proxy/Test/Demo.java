package com.atguigu.proxy.Test;


import com.atguigu.proxy.cglib.ProxyFactoryCglib;
import com.atguigu.proxy.cglib.TeacherDaoCglib;
import com.atguigu.proxy.dynamic.ITeacherDao;
import com.atguigu.proxy.dynamic.ProxyFactory;
import com.atguigu.proxy.dynamic.TeacherDao;
import org.junit.Test;


public class Demo {
    public static void main(String[] args) {


        int num = 100000;

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            ITeacherDao target = new TeacherDao();
            ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
//            proxyInstance.teach();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("jdk time cost : " + ((endTime - startTime)) + " ms");




        startTime = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            TeacherDaoCglib target2 = new TeacherDaoCglib();
            TeacherDaoCglib proxyInstance2 = (TeacherDaoCglib)new ProxyFactoryCglib(target2).getProxyInstance();

        }
        endTime = System.currentTimeMillis();
        System.out.println("Cglib time cost : " + ((endTime - startTime)) + " ms");

    }


    @Test
    public void test2(){

        int num = 10000000;
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

        TeacherDaoCglib target2 = new TeacherDaoCglib();
        TeacherDaoCglib proxyInstance2 = (TeacherDaoCglib)new ProxyFactoryCglib(target2).getProxyInstance();


        long startTime = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            proxyInstance.teach();
        }
        long endTime = System.currentTimeMillis();
        long jdktime = endTime - startTime;
//        System.out.println("jdk time cost : " + ((endTime - startTime)) + " ms");




        startTime = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            proxyInstance2.teach();
        }
        endTime = System.currentTimeMillis();
        long cglibtime = endTime - startTime;

        System.out.println("jdk time cost : " + jdktime + " ms");
        System.out.println("Cglib time cost : " + cglibtime + " ms");

    }
}
