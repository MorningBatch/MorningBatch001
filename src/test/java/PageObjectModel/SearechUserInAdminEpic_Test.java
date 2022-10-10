package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearechUserInAdminEpic_Test {

	public static void main(String[] args) throws Exception {

		// setup the chromedriver
		WebDriverManager.chromedriver().setup();

		// launch the chrome browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// launch the application in oppened browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(7000);

		OrangeHRM_LoginPage olp = new OrangeHRM_LoginPage(driver);
		OrangeHRM_PIMPage opp = new OrangeHRM_PIMPage(driver);
		OrangeHRM_AdminPage oap = new OrangeHRM_AdminPage(driver);

		olp.enterUnserName();
		olp.enterPassword();
		olp.clickOnSubmitBtn();

		Thread.sleep(8000);

		boolean verifyPIM = opp.pimVerification();

		if (verifyPIM == true) {

			oap.clickOnAdminLink();
			Thread.sleep(3000);
			oap.clickOnUserManageLink();
			Thread.sleep(3000);
			oap.clickOnUsers();
			Thread.sleep(3000);
			boolean verifySystemUser = oap.verifySystemUserSpan();

			if (verifySystemUser == true) {
				oap.enterUserNameInAmdinPage();
				oap.clickOnSearchBtn();
			} else {
				System.out.println("SystemUsers block is not displayed");
			}

		} else {
			System.out.println("Login Unsuccess");
		}
		
		
		Thread.sleep(10000);
		driver.quit();

	}

}
