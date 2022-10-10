package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_PerformancePage {
	
	WebDriver driver;
	
	public OrangeHRM_PerformancePage(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='oxd-main-menu']/li[7]/a")
	public WebElement perfomance;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Employee Trackers']")
	public WebElement empTracker;
	
	@FindBy(how = How.XPATH, using = "//*[text() = 'Employee Performance Trackers']")
	public WebElement verifyEMPTracker;
	
	@FindBy(how = How.XPATH, using = "//*[@placeholder='Type for hints...']")
	public WebElement searchEMPName;
	
	@FindBy(how = How.XPATH, using = "//*[@type='submit']")
	public WebElement searchBTNInPerfomancePage;
	
	
	public void clickOnPerfomanceLink() {
		perfomance.click();
	}
	
	public void clickOnempTracker() {
		empTracker.click();
	}
	
	public boolean verifyEMPTrackerInPerfomance() {
		boolean empTrackerval = verifyEMPTracker.isDisplayed();
		return empTrackerval;
	}
	
	public void enterEMPName() {
		searchEMPName.sendKeys("Charlie Carter");
	}
	
	public void clickOnSearchBtnInPerfomancePage() {
		searchBTNInPerfomancePage.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
