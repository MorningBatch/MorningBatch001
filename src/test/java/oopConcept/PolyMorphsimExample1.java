package oopConcept;

public class PolyMorphsimExample1 {
	
	public void bullet() {
		System.out.println("This is Parent Bullet");
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
	}
		
}


class ChildPoly extends PolyMorphsimExample1{
	
	public void bullet(String s) {
		System.out.println("This is Child class Bullet");
	}
	
	public void add(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	public void add(float x, int y) {
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		ChildPoly cp = new ChildPoly();
		cp.bullet("Shareef");
		cp.bullet();
		cp.add(10, 20);
		cp.add(10.5f, 10);
		cp.add(10, 20, 30);
	}
	
	
}
