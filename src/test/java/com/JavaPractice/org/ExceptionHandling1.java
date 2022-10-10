package com.JavaPractice.org;

public class ExceptionHandling1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		try {
			int c = a / b;

		} 
		catch (ArithmeticException ae) {
			System.out.println(ae);

		}
		catch (Throwable t) {
			System.out.println(t);
		} 
		finally {
			System.out.println("This is Finally block of Exception handaling");
		}

		int d = a / 5;

		System.out.println(d);

		System.out.println("Hello Students");
		System.out.println("Good Bye Students");

	}

}
