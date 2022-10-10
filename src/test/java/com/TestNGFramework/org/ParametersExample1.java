package com.TestNGFramework.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersExample1 {

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Reporter.log("Pre-Condition done successfully");

	}

	
	
	@Parameters({ "username", "password" })
	@Test
	public void loginOfOrangeHRM(String un, String pws) throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pws);
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		Reporter.log("Login Success");

	}
	
	
	
	
	
	
	
	

	@AfterClass
	public void tesrDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

}
