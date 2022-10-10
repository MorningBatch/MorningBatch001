package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_PIMPage {

	WebDriver driver;

	public OrangeHRM_PIMPage(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//*[text()='PIM'])[last()]")
	public WebElement pim;

	public boolean pimVerification() {
		boolean val = pim.isDisplayed();
		return val;
	}

}
