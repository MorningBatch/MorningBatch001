package oopConcept;

public class Parent1 {

	public void m1() {
		System.out.println("This is a Parent1 class method1");
	}

	public void m2() {
		System.out.println("This is a Parent1 class method2");
	}

}

class Parent2 {

	public void m1() {
		System.out.println("This is a Parent2 class method1");
	}

	public void m2() {
		System.out.println("This is a Parent2 class method2");
	}

}

//class Child extends Parent1,Parent2{ //Compile time error, multiple inheritance not possible in java
//
//	public static void main(String[] args) {
//		Child c = new Child();
//		c.m1();
//	}
//}







