package com.JavaPractice.org;

public class JavaExample1 {

	public static void main(String[] args) {

		int x = 100;
		float y = (float) 100.5;
		String s = "Shareef";
		char c ='J';

		System.out.println("Instance variables values start");
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
		System.out.println(c);
		System.out.println("Instance variables values end");
		System.out.println();

		JavaExample1 obj = new JavaExample1();
		obj.method1(x, y, s, c);

	}

	public void method1(int a, float f, String s, char c) {
//		

		System.out.println(a);
		System.out.println(f);
		System.out.println(s);
		System.out.println(c);

	}

}
