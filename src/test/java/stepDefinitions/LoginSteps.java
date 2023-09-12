package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;
import utilities.Utilities;

public class LoginSteps extends Base{
	
	//Here we are inside the LoginSteps class which inside the stepDefinitions package. In this class we will write 
	//the code steps  for LoginSteps
	
	LoginPageObjects login = new LoginPageObjects();
	
	@Given("^user is on test environment homepage$")
	public void user_is_on_test_environment_homepage() throws IOException {
		login.validateHomePage();
		logger.info("Homepage validated successfully");
		Utilities.takeScreenShot("Homepage");
		
	}
	
	@When("user click on myaccount button")
	public void user_click_on_myaccount_button() {
		login.clickOnMyAccountButton(); 
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		login.clickOnLoginButton();
	}

	@Then("user enter username and password")
	public void user_enter_username_and_password() {
		login.enterUserName();
		login.enterPassword();
	}

	@Then("user click on login button to login to the page")
	public void user_click_on_login_button_to_login_to_the_page() {
		login.clickOnLoginButtonMain();
	}
}
