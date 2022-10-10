package com.OrangeHRM.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropExample1 {

	public static void main(String[] args) {

		// set up the chrome driver
		WebDriverManager.chromedriver().setup();

		// launch the browser
		WebDriver driver = new ChromeDriver();

		// create the dynamic synchronization using WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.manage().window().maximize();

		// open the given URL in opened browser
		driver.get("https://jqueryui.com/droppable/");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Droppable'])[1]")));

		WebElement frame = driver.findElement(By.className("demo-frame"));

		driver.switchTo().frame(frame);

		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));

		WebElement drop = driver.findElement(By.id("droppable"));

		Actions keyMouse = new Actions(driver);

		keyMouse.dragAndDrop(drag, drop);
		keyMouse.perform();

	}

}
