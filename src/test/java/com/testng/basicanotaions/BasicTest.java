package com.testng.basicanotaions;

import org.testng.annotations.*;

public class BasicTest {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("This is before suit ");
	}

/*	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before Method");

	}*/

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class");

	}

	/*@BeforeGroups
	public void beforeGroups() {

		System.out.println("This is before groups ");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("This is before Test");
	}
*/
	@Test
	public void test() {
		System.out.println("This is test method ");
	}
}
