package com.OrangeHRM.org;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizationsExample1 {

	public static void main(String[] args) {

		// set up the browser
		WebDriverManager.chromedriver().setup();

		// launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		// open the application url in opened browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// add the synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='PIM'])[last()]")));
		
		driver.findElement(By.xpath("//*[text()=' Add ']")).click();
		
	}

}
