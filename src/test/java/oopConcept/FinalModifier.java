package oopConcept;

//public class FinalModifier extends FinalModifier2{
//
//	public static void main(String[] args) {
//		FinalModifier fm = new FinalModifier();
//		fm.method1(); //compile time error
//		fm.method2(); //compile time error
//	}
//
//}

final class FinalModifier2 {

	public void method1() {
		System.out.println("Hello");
	}

	public void method2() {
		System.out.println("Bye");
	}
}
