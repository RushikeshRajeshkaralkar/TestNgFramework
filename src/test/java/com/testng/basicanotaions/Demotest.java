package com.testng.basicanotaions;

import org.testng.annotations.Test;

public class Demotest implements DataMethod {

	@Test(priority=3)
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test1");

	}

	@Test(priority=1)
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("Test2");

	}

	@Test(priority=2)
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("Test3");

	}

	@Test()
	public void test4() {
		// TODO Auto-generated method stub
		System.out.println("Test4");

	}

	@Test(priority=4)
	public void test5() {
		// TODO Auto-generated method stub
		System.out.println("Test5");

	}

	@Test(priority=10)
	public void test6() {
		// TODO Auto-generated method stub
		System.out.println("Test6");

	}

}
