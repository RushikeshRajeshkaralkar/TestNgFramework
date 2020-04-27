package com.testng.demo.practice;

import org.testng.annotations.*;

public class demoTest {

	@Test(groups={"demo"})
	public void test1() {

		System.out.println("this is Test of Demo Class ");
	}
	@Test(groups={""})
	public void my()
	{
		System.out.println("My");
	}

}
