package oopConcept;

public class CallingEncapsulation {

	public static void main(String[] args) {
		
		//tightly encapsulation using our own corresponding methods
		EncapsulationExample1 exe = new EncapsulationExample1();
		System.out.println("Get methods output");
		exe.getName();
		exe.getHeight();
		exe.getAge();

		
		
		
		
		
		
		
		
		
		
		//tightly encapsulation using getters and setters methods
		EncapsulationExample2 exe2 = new EncapsulationExample2();
		System.out.println(exe2.getEmail());
		exe2.setEmail("Shareef@gmail.com");
		
		System.out.println();
		
		System.out.println(exe2.getPno());
		exe2.setPno(9848032919L);
		
		System.out.println();
		
		System.out.println(exe2.getGender());
		exe2.setGender("female");

	}

}
