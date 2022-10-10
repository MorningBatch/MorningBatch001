package com.TestNGFramework.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample2 {

	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("beforeSuiteMethod");
	}

	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("beforeTestMethod");
	}

	@BeforeGroups
	public void beforeGroupsMethod() {
		System.out.println("beforeGroupsMethod");
	}

	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("beforeClassMethod");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod`");
	}

	@Test
	public void testMethod1() {
		System.out.println("Test Method1");
	}

	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("AfterSuiteMethod");
	}

	@AfterTest
	public void afterTestMethod() {
		System.out.println("AfterTestMethod");
	}

	@AfterGroups
	public void afterGroupsMethod() {
		System.out.println("AfterGroupsMethod");
	}

	@AfterClass
	public void afterClassMethod() {
		System.out.println("AfterClassMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod`");
	}

}
