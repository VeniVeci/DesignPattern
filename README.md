初始代码来源：韩顺平  侵删


适配器模式：

将原有类的接口进行转化


原型模式：

前端会用到

后端的clone也是


桥接模式：

两个抽象类，可以互相组合，而且耦合度很低。

因为两个抽象类都可以创建自己的子类。

实际的例子


组合模式：树状的模型  比如文件系统

文件夹 和 文件


装饰器模式：

给原有类增加功能


**适配器模式与装饰器模式的区别**

**装饰器与适配器都有一个别名叫做 包装模式 (Wrapper)**，它们看似都是起到包装一个类或对象的作用，但是使用它们的目的很不一一样。 适配器模式的意义是要将一个接口转变成另一个接口，它的目的是通过改变接口来达到重复使用的目的。 而装饰器模式不是要改变被装饰对象的接口，而是恰恰要保持原有的接口，但是增强原有对象的功能，或者改变原有对象的处理方式而提升性能。


```
class DecoratorA extends Decorator{
    public DecoratorA(Person person){
        this.person = person;
    }

    @Override
    public void opr() {
        person.opr();
        System.out.println(this.person.name + " study plus");
    }
}
```

加this 和不加this的区别？
