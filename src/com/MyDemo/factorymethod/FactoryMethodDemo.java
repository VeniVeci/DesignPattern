package com.MyDemo.factorymethod;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description: 工厂方法模式
 * @date: 2023/10/15
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        Product productA = factoryA.getProduct();
        productA.show();

    }

}
interface Factory {
    Product getProduct();
}

class FactoryA implements Factory{
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
class FactoryB implements Factory{
    @Override
    public Product getProduct() {
        return new ProductB();
    }
}
//每个产品都有自己的工厂 符合开闭原则
abstract class Product{
    abstract void show();
}

class ProductA extends Product{

    @Override
    void show() {
        System.out.println("ProductA");
    }
}

class ProductB extends Product{

    @Override
    void show() {
        System.out.println("ProductB");
    }
}
