package com.testng.ItestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("This is test of my " + result.getMethod().getMethodName());

	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
