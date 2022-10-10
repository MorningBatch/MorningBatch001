package oopConcept;

public class CallingDeloitte implements DeloitteSeriveProvider {

	@Override
	public void audit() {
		System.out.println("This is a Audit functionality");
	}

	@Override
	public void consulting() {
		System.out.println("This is a Consulting functionality");
	}

	@Override
	public void networking() {
		System.out.println("This is Networking Functionality");
	}

}









class Example12 {
	public static void main(String[] args) {
		DeloitteSeriveProvider service = new CallingDeloitte();
		service.audit();
		service.consulting();
		service.networking();
	}
}








