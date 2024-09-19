package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPO {
	
	public WebDriver driver;
	
	public LoginPO(WebDriver driver) {  
		this.driver=driver;
		PageFactory.initElements(driver, this);;
		
	}
	
	
	// locating web elements
	
	@FindBy(xpath = "//input[@id='EmailId']")
	public WebElement uname;
	
	@FindBy(xpath = "//input[@id='Password']")
	public WebElement pwd;
	
	@FindBy(xpath = "//input[@value='Sign in']")
	public WebElement btnSignIn;
	
	@FindBy(xpath = "//label[normalize-space()='Bayer Admin Ltd-S1']")
	public WebElement radioCompany;
	
	@FindBy(xpath = "//button[@id='btnSelectOrganization']")
	public WebElement btnSelectAccount;
	
	@FindBy(xpath = "//img[@class='logo-img-right']")
	public WebElement Bayerlogo;
	
	
	// Page actions
	
	public void enterCredentials(String username, String password) {
		uname.sendKeys(username);
		pwd.sendKeys(password);
    }
	
	public void clickSignIn() {
		btnSignIn.click();		
    }
	
	public void selectCompany() {
		radioCompany.click();
		btnSelectAccount.click();
	    }
	
	public void verifyBayerlogo() {
		boolean status = Bayerlogo.isDisplayed();
		Assert.assertTrue(status);
		System.out.println("User is on the Home page");
	    }

}
