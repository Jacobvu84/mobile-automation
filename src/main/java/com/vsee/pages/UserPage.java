package com.vsee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vsee.MobilePageObject;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UserPage extends MobilePageObject {

	public UserPage(WebDriver driver) {
		super(driver);
	}

	
	@AndroidFindBy(id = groupIdApp + "searchContact")
	@iOSFindBy(xpath = "")
	private WebElement searchBox;
	
	public void search_contact(String contactAddress) {
		waitFor(searchBox).sendKeys(contactAddress);
		// click to select contact

	}

	public void send_message(String messageContent) {
		// type message
		// click end or press Enter

	}

}
