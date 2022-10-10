package com.TestNGFramework.org;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("@Test annotation method start " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success " + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("on test Failure " + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("on test skipped " + result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("onTestFailedButWithinSuccessPercentage " + result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on .java file start " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on .java finish " + context.getName());

	}

}
