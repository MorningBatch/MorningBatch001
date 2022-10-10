package com.JavaPractice.org;

public class Example2 {

	int a;
	int b;
	int c;

	Example2(int x, int y, int z) {
		this.a = x;
		this.b = y;
		this.c = z;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a+b+c);

	}

	public int add() {

		a = 10;
		b = 20;
		c = a + b;
		return c;

	}

	public static void main(String[] args) {
		Example2 ex2 = new Example2(100, 200, 500);
		System.out.println("normal method return value is : " + ex2.add());
	}

}
