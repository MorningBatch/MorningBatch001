package oopConcept;

public class StaticModifier {

	static class StaticModifier2 {

		static int a = 10;
		static float f = 10.5f;
		static String s = "Shareef";

		static public void m1() {
			System.out.println("inner class method m1");
		}

		static public void m2() {
			System.out.println("inner class method m2");
		}

	}

	public static void main(String[] args) {
		// this is outer class main method
		System.out.println(StaticModifier2.a);
		System.out.println(StaticModifier2.f);
		System.out.println(StaticModifier2.s);
		StaticModifier2.m1();
		StaticModifier2.m2();

	}

}
