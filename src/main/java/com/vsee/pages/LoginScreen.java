package com.vsee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vsee.MobilePageObject;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreen extends MobilePageObject {
	
	final static String groupIdApp = "com.vsee.vsee.beta:id/";

	public LoginScreen(WebDriver driver) {
		super(driver);
	}

	//@AndroidFindBy(id = groupIdApp + "loginEmailEdit")
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Email']")
	private WebElement emailField;

	@AndroidFindBy(id = groupIdApp + "loginPasswordEdit")
	private WebElement pwdField;

	@AndroidFindBy(id = groupIdApp + "loginSignInBut")
	private WebElement loginBtn;
	
	
	public void enter_email(String email) {

		// Just work if click on the element by manual on screen first
		emailField.click();  
		emailField.sendKeys(email);
		getDriver().navigate().back();

	}

	public void enter_password(String password) {
		pwdField.sendKeys(password);
		getDriver().navigate().back();
	}

	public void click_on_login() {
		loginBtn.click();

	}

}
