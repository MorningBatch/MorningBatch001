package com.TestNGFramework.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExample1 {

	WebDriver driver;

	@Test
	public void googleApp() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("http://www.google.com");

		driver.findElement(By.name("q")).sendKeys("TestNG");
		driver.findElement(By.name("btnK")).click();

		Thread.sleep(5000);

		driver.quit();

	}

	@Test
	public void faceBookApp() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://facebook.com");

		Thread.sleep(5000);
		driver.quit();

	}

}

class ParallelExample2{
	
	WebDriver driver;
	
	@Test
	public void linkdinApp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://in.linkedin.com/");

		Thread.sleep(5000);
		driver.quit();
		
	}
	
}





