package com.vsee.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.vsee.steps.LoginSteps;
import com.vsee.steps.UserSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenSendMessageContactTest {

	@Managed(driver = "appium")
	WebDriver driver;

	@Steps
	LoginSteps attempTo;
	
	@Steps
	UserSteps jacob;
	
	@Test
	public void sendMessageToContactThatiSOnTheContactList() {
		
		attempTo.use_email().with_password().login();
		
		jacob.compose().message("This message is sent by Jacob").send_to("Test Call");
		
	}
}
