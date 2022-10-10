package com.TestNGFramework.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsAndDependsOnMethods {

	@Test(groups = "Smoke")
	public void testMethod1() {
		Assert.fail();
		System.out.println("This is testMethod1");
	}

	@Test(groups = "Regression", dependsOnGroups = "Smoke")
	public void testMethod2() {
		System.out.println("This is testMethod2");
	}

	@Test(groups = "Smoke")
	public void testMethod3() {
		Assert.fail();
		System.out.println("This is testMethod3");
	}

	@Test(groups = "Regression", dependsOnGroups = "Smoke")
	public void testMethod4() {
		System.out.println("This is testMethod4");
	}

	@Test(groups = "Regression", dependsOnGroups = "Smoke")
	public void testMethod5() {
		System.out.println("This is testMethod5");
	}

}
