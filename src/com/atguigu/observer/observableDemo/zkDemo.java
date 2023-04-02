package com.atguigu.observer.observableDemo;

import java.util.Observable;

public class zkDemo extends Observable {
    String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        setChanged();
        notifyObservers(this.address);
    }


}
