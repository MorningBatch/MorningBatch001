package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import oopConcept.PublicAccessModifierExample1;

public class LoginTest {

	public static void main(String[] args) throws Exception {

		// browser setup
		WebDriverManager.chromedriver().setup();

		// launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// add the sync
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// open the orangeHRM application in oppened browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(7000);

		OrangeHRM_LoginPage olp = new OrangeHRM_LoginPage(driver);
		olp.enterUnserName();
		olp.enterPassword();
		olp.clickOnSubmitBtn();

		OrangeHRM_PIMPage opp = new OrangeHRM_PIMPage(driver);
		boolean b = opp.pimVerification();
		if (b == true) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login Unsuccess");
		}

	}

}
