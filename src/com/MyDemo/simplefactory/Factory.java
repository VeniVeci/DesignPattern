package com.MyDemo.simplefactory;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description: �򵥹�������
 * @date: 2023/10/15
 */
public class Factory {
    public static void main(String[] args) {
        Product productA = Factory.getProduct("TypeA");
        productA.show();
    }
    // �򵥹���  ���� ��η��ز�ͬ�Ĳ�Ʒ
    public static Product getProduct(String type){
        Product product = null;
        if("TypeA".equals(type)){
            product = new ProductA();
        }else if("TypeB".equals(type)){
            product = new ProductB();
        }
        return product;

    }
}


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
