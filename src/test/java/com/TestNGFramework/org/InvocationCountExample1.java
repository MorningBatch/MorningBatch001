package com.TestNGFramework.org;

import org.testng.annotations.Test;

public class InvocationCountExample1 {

	@Test(enabled = true)
	public void testMethod1() {

		System.out.println("Hello");
	}

	@Test(enabled = true)
	public void testMethod2() {

		System.out.println("Hi");
	}

	@Test(enabled = false)
	public void testMethod3() {

		System.out.println("Good Morning");
	}

	@Test(enabled = true)
	public void testMethod4() {

		System.out.println("Good Bye");
	}

}
