package com.MyDemo.builder;

import org.junit.Test;
/*
建造者模式是一种创建对象的模式 就是创建型模式
为什么会有这个建造者模式呢   是因为创建一个对象 需要步骤比较多，所以搞一个抽象类，将这些步骤封装进去，
交由不同的子类去实现，在进行创建对象时 传入父类型，即可创建出相应的子类。
所以还需要有一个指挥者，将抽象类聚合到指挥者类中。

 */
public class Client {
	public static void main(String[] args) {

		//盖普通房子
		CommonHouse commonHouse = new CommonHouse();
		//准备创建房子的指挥者
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		//完成盖房子，返回产品(普通房子)
		House house = houseDirector.constructHouse();

		System.out.println("--------------------------");
		//盖高楼
		HighBuilding highBuilding = new HighBuilding();
		//重置建造者
		houseDirector.setHouseBuilder(highBuilding);
		//完成盖房子，返回产品(高楼)
		houseDirector.constructHouse();


	}

	@Test
	public void  test(){
		//  传统方法进行对象的构建
		CommonHouse commonHouse = new CommonHouse();
		commonHouse.buildBasic();
		commonHouse.buildWalls();
		commonHouse.roofed();

		HighBuilding highBuilding = new HighBuilding();
		highBuilding.buildBasic();
		highBuilding.buildWalls();
		highBuilding.roofed();
	}
}
