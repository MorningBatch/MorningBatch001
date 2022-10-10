package oopConcept;

public class ProtectedModifier1 {

	protected int a = 10;
	
	public static void main(String[] args) {
		
	}

	protected void method1() {
		System.out.println("Hello");
	}
	
	protected class ProtectedModifier2{
		
		public void method3()
		{
			ProtectedModifier2 pm3 = new ProtectedModifier2();
			pm3.method2();
		}
		
		public void method2() {
			System.out.println("Hello Shareef");
		}
	}

}
