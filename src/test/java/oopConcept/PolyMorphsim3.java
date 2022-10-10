package oopConcept;

public class PolyMorphsim3 {

	public void add() {
		System.out.println("This is no-args method of Parent");
	}

	public void add(int a) {
		System.out.println(a + "This is sigle arg method of Parent");
	}

}

class ChildPoly3 extends PolyMorphsim3 {

	public void add() {
		System.out.println("This is no-args method of Child");
	}

	public void add(int x) {
		System.out.println(x + "This is sigle arg method of child");
	}

	public static void main(String[] args) {
		ChildPoly3 cp3 = new ChildPoly3();
		cp3.add();
		cp3.add(10);
	}
}
