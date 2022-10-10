package com.TestNGFramework.org;

import org.testng.annotations.Test;

public class PriorityExample1 {

	@Test(priority = 3)
	public void xyz() {
		System.out.println("xyz");
	}

	@Test(priority = 0)
	public void abc() {
		System.out.println("abc");
	}

	@Test(priority = 1)
	public void shareef() {
		System.out.println("Shareef");
	}

	@Test(priority = 2)
	public void Shareef123() {
		System.out.println("Shareef123");
	}

}
