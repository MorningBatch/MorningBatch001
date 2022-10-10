package oopConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example14 implements HDFCBank, DeloitteSeriveProvider {

	@Override
	public void audit() {
		System.out.println("Deloitte Interface Function");
	}

	@Override
	public void consulting() {
		
	}

	@Override
	public void networking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void homeLoan() {
		System.out.println("HDFCBank Function");
	}

	@Override
	public void creditCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void personalLoan() {
		// TODO Auto-generated method stub
		
	}
	
	
		
		
	}


