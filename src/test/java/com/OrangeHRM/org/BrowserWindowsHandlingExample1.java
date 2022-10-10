package com.OrangeHRM.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowsHandlingExample1 {

	public static void main(String[] args) throws Exception {

		// setup the chrome driver for chrome browser
		WebDriverManager.chromedriver().setup();

		// launch the chrome browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);

		// launch the Citi back url
		driver.get("https://www.online.citibank.co.in/");

		String tab1 = driver.getWindowHandle();

		System.out.println(tab1);

		Thread.sleep(7000);

		driver.findElement(By.xpath("//a[@title='Login']")).click();

		Thread.sleep(5000);

		Set<String> tabsId = driver.getWindowHandles();

		System.out.println(tabsId);

		Iterator<String> tabs = tabsId.iterator();

		while (tabs.hasNext()) {

			String val = tabs.next();

			driver.switchTo().window(val);

			if (driver.getTitle().contains("Citibank India")) {
				driver.findElement(By.id("User_Id")).sendKeys("Shareefbsk");
				Thread.sleep(5000);
				driver.close();
			}

		}

		driver.switchTo().window(tab1);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@title='Login']")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
