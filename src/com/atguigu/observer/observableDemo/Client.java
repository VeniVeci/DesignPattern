package com.atguigu.observer.observableDemo;

public class Client {
    public static void main(String[] args) {
        zkDemo zkDemo = new zkDemo();
        zkDemo.setAddress("1385y");

        Consumer consumer = new Consumer();
        zkDemo.addObserver(consumer);
        zkDemo.setAddress("4567");
        zkDemo.setAddress("3457");

    }
}
