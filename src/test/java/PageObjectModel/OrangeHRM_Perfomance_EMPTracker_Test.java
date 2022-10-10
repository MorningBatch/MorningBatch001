package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_Perfomance_EMPTracker_Test {

	public static void main(String[] args) throws Exception {

		// browser setup
		WebDriverManager.chromedriver().setup();

		// launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// add the sync
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// open the orangeHRM application in opened browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(7000);

		OrangeHRM_LoginPage olp = new OrangeHRM_LoginPage(driver);
		OrangeHRM_PIMPage opp = new OrangeHRM_PIMPage(driver);
		OrangeHRM_PerformancePage opf = new OrangeHRM_PerformancePage(driver);

		olp.enterUnserName();
		olp.enterPassword();
		olp.clickOnSubmitBtn();

		Thread.sleep(7000);

		boolean verifyPIM = opp.pimVerification();

		if (verifyPIM == true) {

			opf.clickOnPerfomanceLink();
			Thread.sleep(5000);
			opf.clickOnempTracker();
			Thread.sleep(10000);

			boolean verifyEMPTrack = opf.verifyEMPTrackerInPerfomance();
			if (verifyEMPTrack == true) {
				opf.enterEMPName();
				Thread.sleep(2000);
				opf.clickOnSearchBtnInPerfomancePage();
			} else {
				System.out.println("EMP Tracker is not display");
			}

		} else {
			System.out.println("Login is Unsuccess");
		}

		Thread.sleep(10000);
		driver.quit();

	}

}
