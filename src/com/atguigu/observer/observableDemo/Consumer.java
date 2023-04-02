package com.atguigu.observer.observableDemo;

import java.util.Observable;
import java.util.Observer;

public class Consumer implements Observer {
    String address;

    public String getAddress() {
        return address;
    }


    @Override
    public void update(Observable o, Object arg) {
        address = (String) arg;
        display();
    }

    private void display() {
        System.out.println("client received the update :addresss = " + address);
    }
}
