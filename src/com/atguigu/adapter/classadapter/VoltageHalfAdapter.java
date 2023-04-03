package com.atguigu.adapter.classadapter;

//��������
public class VoltageHalfAdapter extends Voltage220V implements IVoltageV {

	@Override
	public int outputHalfV() {
		int srcV = output220V();
		int dstV = srcV/2;
		return dstV;
	}
}
