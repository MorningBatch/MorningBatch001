package com.TestNGFramework.org;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestScript1 {

	@Test
	public void testMethod1() {
		System.out.println("This is testMethod1");
	}

	@Test
	public void testMethod2() {
		Assert.fail();
		System.out.println("This is testMethod2");
	}

	@Test(dependsOnMethods = "testMethod2")
	public void testMethod3() {
		System.out.println("This is testMethod2");
	}

}
