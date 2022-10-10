package com.JavaPractice.org;

public class Instanceexample2 {

	int a=50;
	String s="r";
	
	
	public static void main(String[] args) {
		
		Instanceexample2 Ins =new Instanceexample2();
		
		System.out.println(Ins.a);
		System.out.println(Ins.s);
		
		Ins.method();
		
		
		
		
	}
	public void method() {
		
		int i = 123;
		short x = 10;
		long s = 565;
		float f = 1025;
		
		
		System.out.println(i);
		System.out.println(x);
		System.out.println(s);
		System.out.println(f);
	
}
}