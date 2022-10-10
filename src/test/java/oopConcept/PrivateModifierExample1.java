package oopConcept;

public class PrivateModifierExample1 {

	private int a = 10;

	private void method1() {
		System.out.println("Hello");
	}

	public void method2() {
		System.out.println(a);
	}

}

class PrivateModifierExample2 {

	public static void main(String[] args) {
		PrivateModifierExample1 pme = new PrivateModifierExample1();
//		System.out.println(pme.a); // compile error because we are calling private member
//		pme.method1(); // compile error because we are calling private member
		pme.method2();
	}
}
