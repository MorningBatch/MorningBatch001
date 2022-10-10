package com.OrangeHRM.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowsHandlingExample2 {

	public static void main(String[] args) throws Exception {

		// setup the chrome driver for chrome browser
		WebDriverManager.chromedriver().setup();

		// launch the chrome browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);

		// launch the nextgen url
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");

		Thread.sleep(6000);

		// get the current window information
		String window1 = driver.getWindowHandle();
		// display current window id in console
		System.out.println(window1);

		// click the button1
		driver.findElement(By.id("button1")).click();

		Thread.sleep(2000);

		// get the all windows information and in insert into Set of Strings
		Set<String> windows = driver.getWindowHandles();

		// make those windows into arraged group using iterator() method
		Iterator<String> allWindows = windows.iterator();

		// write a repeated condition to read one by one value using Iterator methods
		while (allWindows.hasNext()) {

			String windowval = allWindows.next();

			// switchTo captured window using switchTo() method
			driver.switchTo().window(windowval);

			// get the title of the switched window
			String title = driver.getTitle();

			// verify current title is my window title or not
			if (title.equals("NxtGen A.I Academy – Learn With Clarity")) {
				Thread.sleep(3000);
				driver.close();
			}

		}

		// switchTo first window browser
		driver.switchTo().window(window1);
		Thread.sleep(3000);
		driver.quit();

	}

}
