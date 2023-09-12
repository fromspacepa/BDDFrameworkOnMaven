package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObjects extends Base {

	//in this class we are storing our pageobjects/attributes/locator
	//we will implement the PageFactory.initElements to initialize our page objects
	//PageFactory is coming form selenium
	//once we get the loctor for our elements, we use the @FindBy annotation from selenium
	//store our pageobjects and we can write a get method to access our pageobject
	//in stepDefinition class
	//we will store our elements as private webelement, so that we can only access
	//them through get method
	
	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValildate;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement userNameFiled;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButtonMain;
	
	public void validateHomePage() {
		String text = textToValildate.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified!");
		}else {
			logger.info("Text does not match!");
		}
	}
	public void clickOnMyAccountButton() {
		myAccountButton.click();
	}
	public void clickOnLoginButton() { 
		loginButton.click();
	}
	public void enterUserName() {
		userNameFiled.sendKeys("email@email.com");
	}
	public void enterPassword() {
		passwordField.sendKeys("1234");
	}
	public void clickOnLoginButtonMain() {
		loginButtonMain.click();
	}

}