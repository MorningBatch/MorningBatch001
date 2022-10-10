package ConstructorsExample;

public class Registration {

	String name;
	int rolln;

	Registration(String val1, int val2) {
		this.name = val1;
		this.rolln = val2;
	}

	public static void main(String[] args) {

		Registration reg1 = new Registration("Shareef", 101);
		System.out.println(reg1.name + "	" + reg1.rolln);

		Registration reg2 = new Registration("Jay", 102);
		System.out.println(reg2.name + "	" + reg2.rolln);

		Registration reg3 = new Registration("Sanjay", 103);
		System.out.println(reg3.name + "	" + reg3.rolln);

		Registration reg4 = new Registration("Ranjit", 104);
		System.out.println(reg4.name + "	" + reg4.rolln);

	}

}
