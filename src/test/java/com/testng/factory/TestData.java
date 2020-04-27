package com.testng.factory;

import org.testng.annotations.Test;

public class TestData {

	int parm;

	public TestData(int parm) {
		// TODO Auto-generated constructor stub
		this.parm = parm;
	}

	@Test
	public void mytest() {
		System.out.println("print tests");
	}
	

	@Test
	public void mytest1() {
		System.out.println("print tests");
	}
}
