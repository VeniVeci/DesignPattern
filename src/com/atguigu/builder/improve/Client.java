package com.atguigu.builder.improve;

import org.junit.Test;

public class Client {
	public static void main(String[] args) {

		//����ͨ����
		CommonHouse commonHouse = new CommonHouse();
		//׼���������ӵ�ָ����
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		//��ɸǷ��ӣ����ز�Ʒ(��ͨ����)
		House house = houseDirector.constructHouse();

		System.out.println("--------------------------");
		//�Ǹ�¥
		HighBuilding highBuilding = new HighBuilding();
		//���ý�����
		houseDirector.setHouseBuilder(highBuilding);
		//��ɸǷ��ӣ����ز�Ʒ(��¥)
		houseDirector.constructHouse();


	}

	@Test
	public void  test(){
		//  ��ͳ�������ж���Ĺ���
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
