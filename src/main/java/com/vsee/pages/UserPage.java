package com.vsee.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vsee.MobilePageObject;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.annotations.findby.FindBy;

public class UserPage extends MobilePageObject {

	public UserPage(WebDriver driver) {
		super(driver);
	}
	
	
	@AndroidFindBy(id = "android:id/search_src_text")
	@iOSFindBy(xpath = "")
	private WebElement searchBox;
	
	
	@AndroidFindBy(id = "com.vsee.vsee.beta:id/chatEditText")
	private WebElement chatBox;
	
	@AndroidFindBy(id = "com.vsee.vsee.beta:id/itemContactListDetailsLayout")
	private WebElement firstContact;
	
	
	@AndroidFindBy(id = "com.vsee.vsee.beta:id/context_chat")
	private WebElement contextChat;
	
	@AndroidFindBy(id = "com.vsee.vsee.beta:id/chatSendBut")
	private WebElement chatSendBut;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='More']")
	private WebElement nagivaMore;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sign Out']")
	private WebElement menuSignOut;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	private WebElement navigateUp;
	
	public void search_contact(String contactAddress) {
		waitFor(searchBox).sendKeys(contactAddress);
		firstContact.click();
		contextChat.click();
	}

	public void send_message(String messageContent) {
		waitFor(chatBox).sendKeys(messageContent);
		chatSendBut.click();

	}

	public void log_out() {
		navigateUp.click();
		nagivaMore.click();
		getDriver().navigate().back();
		menuSignOut.click();
		
	}

}
