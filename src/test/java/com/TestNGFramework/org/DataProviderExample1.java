package com.TestNGFramework.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample1 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Reporter.log("Pre-Condition done successfully");

	}
	
	
	@Test(dataProvider = "loginData", dataProviderClass = DataProviderExample1.class)
	public void loginOfOrangeHRM(String un, String pws) throws Exception {
		driver.get("");
		Thread.sleep(7000);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pws);
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		Reporter.log("Login Success");

	}
	
	
	
	

	@AfterMethod
	public void tesrDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

	@DataProvider(name = "loginData")
	public Object[][] orangeHRMLoginData() {

		Object[][] data = new Object[2][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "admin";
		data[1][1] = "admin123";

//		data[2][0] = "Shareef";
//		data[2][1] = "Shareef123";
//
//		data[3][0] = "xyzabc";
//		data[3][1] = "xyz";
//
//		data[4][0] = "testng";
//		data[4][1] = "testng123";

		return data;
	}

}
