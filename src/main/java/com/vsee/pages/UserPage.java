package com.vsee.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vsee.MobilePageObject;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UserPage extends MobilePageObject {

	public UserPage(WebDriver driver) {
		super(driver);
	}
	
	
	@AndroidFindBy(id = "android:id/search_src_text")
	@iOSFindBy(xpath = "")
	private WebElement searchBox;
	
	@AndroidFindBy(id = "com.vsee.vsee.beta:id/itemChatListDetailLayout")
	private WebElement firstContact;
	
	@AndroidFindBy(id = "com.vsee.vsee.beta:id/chatEditText")
	private WebElement chatBox;
	
	
	public void search_contact(String contactAddress) {
		searchBox.sendKeys(contactAddress);
		firstContact.click();

	}

	public void send_message(String messageContent) {
		chatBox.sendKeys(messageContent);
		chatBox.sendKeys(Keys.ENTER);

	}

}
