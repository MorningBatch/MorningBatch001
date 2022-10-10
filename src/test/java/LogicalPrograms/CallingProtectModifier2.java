package LogicalPrograms;

import oopConcept.ProtectedModifier1;

public class CallingProtectModifier2 extends ProtectedModifier1 {

	public static void main(String[] args) {
		
		CallingProtectModifier2 pm2 = new CallingProtectModifier2();
		System.out.println(pm2.a);
		pm2.method1();
		
	}

}
