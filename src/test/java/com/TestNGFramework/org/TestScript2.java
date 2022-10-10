package com.TestNGFramework.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript2 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Reporter.log("Pre-Condition done successfully");

	}

	@Test(retryAnalyzer = com.TestNGFramework.org.SecondChanceClass.class)
	public void loginOfOrangeHRM() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.name("usernam")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		Reporter.log("Login Success");

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}
	
	

}
