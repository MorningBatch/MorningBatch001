package LogicalPrograms;

import oopConcept.ProtectedExample1;

public class CallingProtectedFromOutSideOfPackage extends ProtectedExample1 {
	public static void main(String[] args) {
		CallingProtectedFromOutSideOfPackage pe2 = new CallingProtectedFromOutSideOfPackage();
		System.out.println(pe2.a);// compile time error
		pe2.protectedMethod();// compile time error
	}
}
 