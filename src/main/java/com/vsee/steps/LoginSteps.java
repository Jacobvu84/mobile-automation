package com.vsee.steps;

import com.vsee.pages.LoginScreen;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;

	private LoginScreen onLoginScreen;

	private static String email = System.getProperty("user.mail", "enter-your-gmail-username");
	private static String password = System.getProperty("user.password", "enter-your-password");

	@Step
	public LoginBuilder use_email() {
		return new LoginBuilder(onLoginScreen);
	}

	public static class LoginBuilder {

		private LoginScreen onLoginScreen;

		public LoginBuilder(LoginScreen onLoginScreen) {
			this.onLoginScreen = onLoginScreen;
			onLoginScreen.enter_email(email);
		}

		public LoginBuilder with_password() {
			onLoginScreen.enter_password(password);
			return this;
		}

		public void login() {
			onLoginScreen.click_on_login();
			
		}


	}

}
