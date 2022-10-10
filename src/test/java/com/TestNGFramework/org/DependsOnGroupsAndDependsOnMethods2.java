package com.TestNGFramework.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsAndDependsOnMethods2 {

	@Test
	public void testMethod1() {
		Assert.fail();
		System.out.println("testMethod1");
	}

	@Test(dependsOnMethods = "testMethod1")
	public void testMethod2() {
		System.out.println("testMethod2");
	}

}
