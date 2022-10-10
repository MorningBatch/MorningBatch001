package oopConcept;

public class Example13 {

	static HDFCBank bank;

	public static void main(String[] args) {
		bank = new CallingTheInterFace();
		bank.homeLoan();
		bank.creditCard();
		bank.personalLoan();
	}

}
