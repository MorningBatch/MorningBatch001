package oopConcept;

public class PolyMorphsim2 {

	public void add(int a) {
		System.out.println(a);
	}

	public void add(int x, int y) {
		System.out.println(x + y);
	}

}

class ChildPolyMorphsim extends PolyMorphsim2 {

	public void add(float i, int j) { // OverLoaded method, with same name but different args
		System.out.println(i + j);
	}

	public static void main(String[] args) {
		ChildPolyMorphsim cpm = new ChildPolyMorphsim();
		cpm.add(10.5f, 10);
		cpm.add(10);

	}
}
