package com.MyDemo.decorator;

import java.lang.management.ThreadInfo;
/*
用来增强原有类： 有点像面向切面编程来进行原有功能的增强。
通过依赖该对象实现原有功能的增强。
 */
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
        Person person1 = new DecoratorA(person);
        person1.opr();
        Person person2 = new StrongStu(person);
        person2.opr();
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
//        person.opr();
        System.out.println(person.name + " study plus");
    }
}
class StrongStu extends Decorator{
    public StrongStu(Person person){
        this.person = person;
    }

    @Override
    public void opr() {
//        person.opr();
        System.out.println(person.name + " is a strong student");
    }
}
