package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_LoginPage {

	// declare the WebDriver to call WebDriver methods
	WebDriver driver;

	// create constructor for above WebDriver object initilization
	public OrangeHRM_LoginPage(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}

	// give WebElements information to reusable variables
	@FindBy(how = How.NAME, using = "username")
	public WebElement un;

	//@FindAll({ @FindBy(how = How.NAME, using = "username"),
		//	@FindBy(how = How.CLASS_NAME, using = "oxd-input oxd-input--active") }

	//)
	//public WebElement un;

	@FindBy(how = How.NAME, using = "password")
	public WebElement pws;

	//@FindBys({

			//@FindBy(how = How.NAME, using = "password"),
			//@FindBy(how = How.CLASS_NAME, using = "oxd-input oxd-input--active")

	//})
	//public WebElement pws;

	@FindBy(how = How.XPATH, using = "//*[@type = 'submit']")
	public WebElement submitBtn;

	// create actions/methods for each above WebElements
	public void enterUnserName() {
		un.sendKeys("Admin");
	}

	public void enterPassword() {
		pws.sendKeys("admin123");
	}

	public void clickOnSubmitBtn() {
		submitBtn.click();
	}

}
