package com.JavaPractice.org;

public class Example3 {

	public Example3() {
		System.out.println("This is a public constructor");
	}

	Example3(int a) {
		System.out.println("This is a default constructor");
	}

	protected Example3(int a, int b) {
		System.out.println("This is a protected constructor");
	}

	private Example3(int a, String s, char c) {
		System.out.println("This is a private constructor");
	}

	public static void main(String[] args) {
		Example3 ex1 = new Example3();
		Example3 ex2 = new Example3(10);
		Example3 ex3 = new Example3(100, 200);
		Example3 ex4 = new Example3(500, "Java", 'S');
	}

}
