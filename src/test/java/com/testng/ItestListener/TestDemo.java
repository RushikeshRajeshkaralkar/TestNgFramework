package com.testng.ItestListener;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestDemo implements ITestListener {

	@Test(groups = "Demo")
	public void Test1() {

		Assert.assertEquals(12, 13);

	}

	@Test(groups = "Data")
	public void Test2() {

		System.out.println("This is Data Method ");

	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {
			System.out.println("This Is Faild Test ");
		} else if (ITestResult.SUCCESS == result.getStatus()) {
			System.out.println("This is Pass Test  ");

		}

	}

}
