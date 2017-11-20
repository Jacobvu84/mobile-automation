package com.vsee.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vsee.MobilePageObject;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginScreen extends MobilePageObject {
	
	final static String groupIdApp = "com.vsee.vsee.beta:id/";

	public LoginScreen(WebDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = groupIdApp + "loginEmailEdit")
	@iOSFindBy(xpath = "")
	private WebElement emailField;

	@AndroidFindBy(id = groupIdApp + "loginPasswordEdit")
	private WebElement pwdField;

	@AndroidFindBy(id = groupIdApp + "loginSignInBut")
	private WebElement loginBtn;

	public void enter_email(String email) {
		emailField.sendKeys(email);
		emailField.sendKeys(Keys.TAB);

	}

	public void enter_password(String password) {
		pwdField.sendKeys(password);
		pwdField.sendKeys(Keys.TAB);

	}

	public void click_on_login() {
		loginBtn.click();

	}

}
