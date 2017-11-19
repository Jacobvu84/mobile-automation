package com.vsee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vsee.MobilePageObject;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginScreen extends MobilePageObject {

	public LoginScreen(WebDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = groupIdApp + "email")
	@iOSFindBy(xpath = "")
	private WebElement emailField;

	@AndroidFindBy(id = groupIdApp + "password")
	private WebElement pwdField;

	@AndroidFindBy(id = groupIdApp + "login")
	private WebElement loginBtn;

	public void enter_email(String email) {
		waitFor(emailField).sendKeys(email);

	}

	public void enter_password(String password) {
		pwdField.sendKeys(password);

	}

	public void click_on_login() {
		loginBtn.click();

	}

}
