package oopConcept;

public abstract class AbstarctModifierExample2 {

	public static void main(String[] args) {

	}

	public abstract void add();

	public abstract void mul();

	public abstract void div();

	public abstract void sub();

}

abstract class Example3 extends AbstarctModifierExample2 {

	int a = 10;
	int b = 20;
	int c;

	public static void main(String[] args) {

	}

	@Override
	public void add() {
		c = a + b;
		System.out.println(c);
	}

	@Override
	public void mul() {
		c = a * b;
		System.out.println(c);
	}


}

class Example4 extends Example3 {
	int x = 10;
	int y = 20;
	int z;

	public static void main(String[] args) {
		Example4 ex = new Example4();
		ex.add();
		ex.mul();
		ex.div();
		ex.sub();
	}

	@Override
	public void div() {
		z = x / y;
		System.out.println(z);
	}

	@Override
	public void sub() {
		z = x - y;
		System.out.println(z);

	}

}
