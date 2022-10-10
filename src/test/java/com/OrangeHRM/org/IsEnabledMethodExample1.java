package com.OrangeHRM.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabledMethodExample1 {

	public static void main(String[] args) throws Exception {

		// setup the chrome driver for chrome browser
		WebDriverManager.chromedriver().setup();

		// launch the chrome browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// launch the Citi back url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement loginEle = driver.findElement(By.xpath("//button[@type='submit']"));

		if (loginEle.isEnabled()) {
			loginEle.click();
			System.out.println("loginEle button is Enabled");
		} else {
			System.out.println("loginEle is not Enabled");
		}

	}

}
