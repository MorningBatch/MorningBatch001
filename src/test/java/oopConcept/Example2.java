package oopConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {

		HDFCBank bank = new CallingTheInterFace();

		bank.homeLoan();
		bank.creditCard();
		bank.personalLoan();
	}

}
