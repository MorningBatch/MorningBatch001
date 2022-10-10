package com.JavaPractice.org;

public class SwitchCaseExample1 {

	public static void main(String[] args) {

		int a = 2;

		switch (a) {

		case 1:
			System.out.println("This is case 1");
			break;
		case 2:
			System.out.println("This is case2");
			break;
		case 3:
			System.out.println("This is case3");
			System.out.println("How are you?");
			break;
		default:
			System.out.println("This is default value");
			break;
		}

	}

}
