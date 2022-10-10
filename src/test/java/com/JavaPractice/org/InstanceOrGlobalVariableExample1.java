package com.JavaPractice.org;

public class InstanceOrGlobalVariableExample1 {

	int x = 20;
	String s = "java";

	public static void main(String[] args) {

		InstanceOrGlobalVariableExample1 igv = new InstanceOrGlobalVariableExample1();

		System.out.println(igv.x);
		System.out.println(igv.s);

		igv.childMethod();

	}

	public void childMethod() {
		

		int a = 50;
		float f = (float) 50.5;
		String s2 = "Java2";

		System.out.println(a);
		System.out.println(f);
		System.out.println(s2);

	}

}
