package com.JavaPractice.org;

public class StringExample2 {

	public static void main(String[] args) {

		String s1 = new String("TestingBaba");
		String s2 = s1.concat("Selenium");
		String s3 = "Selenium";
		String s4 = "TestingBaba";
		String s5 = "Shareef";
		String s6 = s1 + s5;
		String s7 = new String("Shareef");
		String s8 = new String("TestingBaba");
		String s9 = "Shareef";

		System.out.println(s1 == s2);//false
		System.out.println(s2 == s3);//false
		System.out.println(s2 == s5);//false
		System.out.println(s5 == s9);//true
		System.out.println(s6 == s1);//false
		System.out.println(s1.equals(s4));//true
		

	}

}
