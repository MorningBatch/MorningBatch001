package oopConcept;

public class DheeruHierarchicalInheritance {

	public void reliance() {
		System.out.println("This is DheeruBhai Functionality");
	}
	public static void main(String[] args) {
		
	}

}

class Mukesh1 extends DheeruHierarchicalInheritance{
	
	public void jio() {
		System.out.println("This is Mukesh Functionality");
	}
	public static void main(String[] args) {
		Mukesh1 m1 = new Mukesh1();
		m1.jio();
		m1.reliance();
		System.out.println();
	}
	
}

class Anil extends DheeruHierarchicalInheritance{
	
	public void jetPlane() {
		System.out.println("This is Anil Functionality");
	}
	
	public static void main(String[] args) {
		Anil a = new Anil();
		a.jetPlane();
		a.reliance();
	}
	
}












