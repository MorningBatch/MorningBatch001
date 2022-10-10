package com.JavaPractice.org;

public class StringContainsMethodExample1 {

	public static void main(String[] args) {

		String s1 = "IT Industry";
		boolean val = s1.contains("IT");
		boolean val2 = s1.contains("it");

		boolean val3 = s1.contains("Radha");

		System.out.println(val);
		System.out.println(val2);
		System.out.println(val3);

	}

}
