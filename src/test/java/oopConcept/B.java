package oopConcept;

class A {

	int a = 10;
	String s1 = "Shareef";

	public void method1() {
		System.out.println("A class method");

	}

	public static void main(String[] args) {
		System.out.println("Class A Main method");
	}

}

public class B {

	int x = 100;

	public static void main(String[] args) {
		System.out.println("Class B Main method");
	}

}

class C {

	public static void main(String[] args) {

		A obj1 = new A();
		System.out.println(obj1.a); // 10
		System.out.println(obj1.s1); // Shareef
		obj1.method1(); // A class method
		System.out.println("Class C Main method");
	}

}
