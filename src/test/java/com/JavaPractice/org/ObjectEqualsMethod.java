package com.JavaPractice.org;

public class ObjectEqualsMethod {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Shareef");
		StringBuffer sb2 = new StringBuffer("Shareef");

		System.out.println(sb1.equals(sb2)); // false

		String s1 = new String("Java");
		String s2 = new String("Java");

		System.out.println(s1.equals(s2)); // true
		
	}

}
