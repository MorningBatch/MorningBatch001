package oopConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import LogicalPrograms.ReverseAStringExample1;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.ArrayList;

public class ImportStatementExample1 {

	public static void main(String[] args) {
		//outside of the package
		WebDriverManager.chromedriver().setup();
		//same package no need for import statement
		B b = new B();
		//outside of the package or directory so we need import statement
		ReverseAStringExample1 rs = new ReverseAStringExample1();
		//outside of the package or directory so we need import statement
		ArrayList al = new ArrayList();
		//outside of the package or directory so we need import statement
		WebDriver driver1 = new ChromeDriver();
		
		//these below class are interfaces are from java.lang package so no need for import statement
		String s1 = new String();
		Thread t = new Thread();
		Exception ex = new Exception();
		StringBuffer sb = new StringBuffer();
		

		driver1.get("http://www.google.com");
		//outside of the package or directory so we need import statement
		WebElement ele = driver1.findElement(By.xpath(""));

	}

}






