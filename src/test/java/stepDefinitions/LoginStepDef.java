package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageLocators.LoginPO;

public class LoginStepDef {
	
	public WebDriver driver;
	public LoginPO loginPage;
	
	
	@Given("User launch the url {string}")
	public void user_launch_the_url(String url) {
	   WebDriverManager.edgedriver().setup();
	   driver = new EdgeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   
	   loginPage = new LoginPO(driver);
		
	}


	@When("User enters the Username as {string} and Password as {string}")
	public void user_enters_the_username_as_and_password_as(String string, String string2) {
		loginPage.enterCredentials("bayeradmin@sandydemo.com", "85790");
		
	}

	@When("User clicks on Login button and selects the account as Company")
	public void user_clicks_on_login_button_and_selects_the_account_as_company() {
		loginPage.clickSignIn();
		
		
	}

	@When("User clicks on Select Account button")
	public void user_clicks_on_select_account_button() {
		loginPage.selectCompany();
		
	}

	@Then("Verify that user successfully logs in")
	public void verify_that_user_successfully_logs_in() {
		loginPage.verifyBayerlogo();
		
	}

	@Then("User closes the browser")
	public void user_closes_the_browser() {
	    driver.close();
	}
	
		

}
