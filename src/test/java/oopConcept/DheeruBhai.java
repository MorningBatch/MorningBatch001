package oopConcept;

public class DheeruBhai {

	public void reliance() {
		System.out.println("This is DheeruBhai Functionality");
	}
	
	public static void main(String[] args) {
	}
}


class Mukesh extends DheeruBhai {

	public void jio() {
		System.out.println("This is Mukesh Functionality");
	}

}

class Akash extends Mukesh {

	public void movieProduction() {
		System.out.println("This is Akash Functionality");
	}

	public static void main(String[] args) {
		Akash a = new Akash();
		a.movieProduction();
		a.jio();
		a.reliance();
	}
}
