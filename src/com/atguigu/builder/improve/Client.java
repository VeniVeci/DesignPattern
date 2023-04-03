package com.atguigu.builder.improve;

import org.junit.Test;

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
