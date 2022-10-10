package oopConcept;

public class ChildInheritance1 extends ParentInheritance1 {

	public void div() {
		System.out.println("This is a Division method of Child");
	}

	public static void main(String[] args) {

		ParentInheritance1 pi = new ParentInheritance1();
		pi.add();
		pi.mult();
		pi.sub();
//		pi.div();// compile time error

		ChildInheritance1 ci = new ChildInheritance1();
		ci.div();
		ci.add();
		ci.mult();
		ci.sub();

		ParentInheritance1 pi2 = new ChildInheritance1();
		pi2.add();
		pi2.mult();
		pi2.sub();
//		pi2.div(); // compile time error

	}

}
