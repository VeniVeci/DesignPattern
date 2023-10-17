package com.MyDemo.decorator;

import java.lang.management.ThreadInfo;

/**
 * @author VeniVeci
 * @program: DesignPattern
 * @description: 增强原有类
 * @date: 2023/10/17
 */
public class Demo {

    public static void main(String[] args) {
        Person person = new Student("kiki");
        person.opr();
        person = new DecoratorA(person);
        person.opr();
    }

}
abstract class Person{
    protected String name;
    public abstract void opr();
}

class Student extends Person {
    public Student(String name) {
        this.name = name;
    }
    @Override
    public void opr() {
        System.out.println(name + "  study");
    }
}

abstract class Decorator extends Person{
    protected Person person;
}
class DecoratorA extends Decorator{
    public DecoratorA(Person person){
        this.person = person;
    }

    @Override
    public void opr() {
        person.opr();
        System.out.println(person.name + " study plus");
    }
}
