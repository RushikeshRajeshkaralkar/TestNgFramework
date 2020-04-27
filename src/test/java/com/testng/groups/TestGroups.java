package com.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

import com.testng.basicanotaions.DataMethod;

public class TestGroups implements DataMethod {

	@Test(groups = { "Smoke" })
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("This is Smoke Test");

	}

	@Test(groups = { "regression" })
	
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("This is Regression Test ");

	}

	@AfterGroups({"Smoke"})
	@Test
	public void test3() {
		// TODO Auto-generated method stub

	}

	public void test4() {
		// TODO Auto-generated method stub

	}

	public void test5() {
		// TODO Auto-generated method stub

	}

	public void test6() {
		// TODO Auto-generated method stub

	}

}
