package com.testng.assertion;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {

	SoftAssert soft = new SoftAssert();

	@BeforeMethod
	public void setUp() {

		System.out.println("Setup Method ");
	}

	@Test
	public void test() {
		soft.assertEquals(false, true);
		System.out.println("Test");
		soft.assertAll();

	}

	@Test(dependsOnMethods = "test")
	public void test2() {

		System.out.println("Test2");
	}

	@AfterMethod
	public void tearDown() {

		System.out.println("tear Down Method ");
	}

}
