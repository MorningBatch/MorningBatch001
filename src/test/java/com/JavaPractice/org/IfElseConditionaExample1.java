package com.JavaPractice.org;

public class IfElseConditionaExample1 {

	public static void main(String[] args) {

		float age1 = (float) 30.8;
		String name1 = "Shareef";

		float age2 = (float) 22.8;
		String name2 = "Swathi";

		if (age1 == 30.8) {
			System.out.println("My name is : " + name1);
		}

		else if (age2 == 22.8f) {
			System.out.println("My name is : " + name2);
		}

		else {
			System.out.println("Please check provided age");
		}

	}

}
