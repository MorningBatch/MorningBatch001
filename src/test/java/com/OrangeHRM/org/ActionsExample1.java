package com.OrangeHRM.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsExample1 {

	public static void main(String[] args) {

		// set up the chrome driver
		WebDriverManager.chromedriver().setup();

		// launch the browser
		WebDriver driver = new ChromeDriver();

		// create the dynamic synchronization using WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.manage().window().maximize();

		// open the given URL in opened browser
		driver.get("https://www.tcs.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));

		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

		WebElement discoverTcs = driver.findElement(By.xpath("(//*[text()='Discover TCS '] )[1]"));

		WebElement tcsResearch = driver.findElement(By.xpath("//*[text()='TCS Research']"));

		Actions keyMouse = new Actions(driver);

		keyMouse.moveToElement(discoverTcs);

		keyMouse.contextClick(tcsResearch);

		keyMouse.sendKeys(Keys.DOWN);
		keyMouse.sendKeys(Keys.DOWN);
		keyMouse.sendKeys(Keys.ENTER);

		keyMouse.perform();

	}

}
