package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM_AdminPage {

	WebDriver driver;

	public OrangeHRM_AdminPage(WebDriver d) {
		this.driver = d;
	}

	By adminLink = By.xpath("//*[@class='oxd-main-menu']/descendant::a[1]");
	By userManageLink = By.xpath("//*[@class='oxd-topbar-body-nav']/descendant::li[1]");
	By users = By.xpath("//*[text()='Users']");
	By verifySystemUsersSpan = By.xpath("//*[text()='System Users']");
	By userName = By.xpath("//*[@class='oxd-form-row']/descendant::div[3]/div[2]/input");
	By submitBtn = By.xpath("//*[@type='submit']");

	public void clickOnAdminLink() {
		driver.findElement(adminLink).click();
	}

	public void clickOnUserManageLink() {
		driver.findElement(userManageLink).click();
	}

	public void clickOnUsers() {
		driver.findElement(users).click();
	}

	public boolean verifySystemUserSpan() {
		boolean val1 = driver.findElement(verifySystemUsersSpan).isDisplayed();
		return val1;
	}

	public void enterUserNameInAmdinPage() {
		driver.findElement(userName).sendKeys("admin");
	}

	public void clickOnSearchBtn() {
		driver.findElement(submitBtn).click();
	}

}
