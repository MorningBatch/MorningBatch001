package com.TestNGFramework.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterExample2 {

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Reporter.log("Pre-Condition done successfully");

	}

	@Parameters({ "username1", "password1", "url" })
	@Test
	public void loginOfOrangeHRM(String un, String pws, String url) throws Exception {
		driver.get(url);
		Thread.sleep(7000);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pws);
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		Reporter.log("Login Success");

	}

	@Parameters("EmployeeName")
	@Test
	public void manageReview(String en) throws Exception {

		Thread.sleep(7000);

		driver.findElement(By.xpath("//span[text() = 'Performance']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text() = 'Manage Reviews ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() = 'Manage Reviews']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder = 'Type for hints...'])[1]")).sendKeys(en);

	}

	@AfterClass
	public void tesrDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

}
