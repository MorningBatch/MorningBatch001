package com.TestNGFramework.org;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class SecondChanceClass implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		int min = 1;
		int max = 2;
		if (min <= max) {
			min = min++;
			return true;
		}
		return false;
	}

}
