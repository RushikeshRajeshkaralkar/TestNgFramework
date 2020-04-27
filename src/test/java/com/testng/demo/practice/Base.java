package com.testng.demo.practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Base {

	@BeforeTest
	public void beforTest() {

		System.out.println("This is Before test method ");

	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("BeforeClas");

	}
}
