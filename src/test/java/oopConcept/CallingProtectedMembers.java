package oopConcept;

public class CallingProtectedMembers {

	public static void main(String[] args) {
		ProtectedExample1 pe = new ProtectedExample1();
		System.out.println(pe.a);
		pe.protectedMethod();
	}

}
