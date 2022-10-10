package com.OrangeHRM.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample1 {

	public static void main(String[] args) throws Exception {

		// set up the browser
		WebDriverManager.chromedriver().setup();

		// launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// open the application url in opened browser
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);

		// click on the Red button
		driver.findElement(By.xpath("//button[contains(text(), 'click the button to display an  alert box')]")).click();
		Thread.sleep(2000);
		

		// jump to alert
		Alert alertBox = driver.switchTo().alert();
		String alerttext = alertBox.getText();
		System.out.println(alerttext);
		Thread.sleep(2000);
//		alertBox.accept();
		alertBox.dismiss();

		Thread.sleep(10000);

		// quit the browser
		driver.quit();

	}

}
