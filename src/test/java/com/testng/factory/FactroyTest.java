package com.testng.factory;

import org.testng.annotations.Factory;

public class FactroyTest {

	@Factory
	public Object[] fact() {
		Object[] data = new Object[3];
		data[0] = new TestData(1);
		data[1] = new TestData(2);
		data[2]=new TestData(3);
		return data;

	}
}
