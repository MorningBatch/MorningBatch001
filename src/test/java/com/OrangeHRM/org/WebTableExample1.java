package com.OrangeHRM.org;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableExample1 {

	public static void main(String[] args) {

		// setup the chrome driver for chrome browser
		WebDriverManager.chromedriver().setup();

		// launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// create the dynamic synchronization using WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.manage().window().maximize();

		// launch the Citi back url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='PIM'])[last()]")));

		// //div[@role='table']//div[@class='oxd-table-body']/div

		List<WebElement> rows = driver.findElements(By.xpath("//div[@role='table']//div[@class='oxd-table-body']/div"));
		System.out.println("Total rows count is :" + rows.size());

		// //div[@role='table']//div[@class='oxd-table-body']/div[1]/div/div

		List<WebElement> columns = driver
				.findElements(By.xpath("//div[@role='table']//div[@class='oxd-table-body']/div[1]/div/div"));
		System.out.println("Total cloumns count is : " + columns.size());

		for (int i = 1; i <= rows.size(); i++) {
			for (int j = 1; j <= columns.size(); j++) {
				String value = driver
						.findElement(By.xpath(
								"//div[@role='table']//div[@class='oxd-table-body']/div[" + i + "]/div/div[" + j + "]"))
						.getText();
				
				if(value.equals("0221")) {
					driver.findElement(By.xpath("//div[@role='table']//div[@class='oxd-table-body']/div[" + i + "]/div/div[1]")).click();
				}
				
				
//				System.out.print(value+"	");
			}
//			System.out.println();
		}

	}

}
