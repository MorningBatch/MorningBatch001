package com.OrangeHRM.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandlesExample3 {

	public static void main(String[] args) throws Exception {

		// setup the chrome driver for chrome browser
		WebDriverManager.chromedriver().setup();

		// launch the chrome browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);

		// open the application URL in opened browser
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		Thread.sleep(5000);

		// get information about current opened window browser
		String window1 = driver.getWindowHandle();

		// click on the first button demo site page
		driver.findElement(By.id("button1")).click();
		Thread.sleep(3000);

		// get the all opened browser windows information
		Set<String> allWindows = driver.getWindowHandles();

		// arrage the proper order of allwindows information
		Iterator<String> windows = allWindows.iterator();

		// read the windows string one by one by using while loop
		while (windows.hasNext()) {
			String windowvalue = windows.next();
			// jump to selected window
			driver.switchTo().window(windowvalue);
			// get current browser window title
			String title = driver.getTitle();

			// display title of current browser
			System.out.println(title);

			// verify captured title is our own title or not
			if (title.equals("NxtGen A.I Academy – Learn With Clarity")) {
				driver.close();
				Thread.sleep(4000);
			}

		}

		// jump to first browser window
		driver.switchTo().window(window1);
		Thread.sleep(4000);
		// quit the entire browser
		driver.quit();

	}

}
