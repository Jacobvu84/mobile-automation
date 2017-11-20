package com.vsee.steps;

import com.vsee.pages.UserPage;

import net.thucydides.core.steps.ScenarioSteps;

public class UserSteps extends ScenarioSteps {

	UserPage userPage;

	public SendBuilder compose() {
		return new SendBuilder(userPage);
	}

	public class SendBuilder {

		private UserPage userPage;

		private String messageContent;

		public SendBuilder(UserPage userPage) {
			this.userPage = userPage;
		}

		public SendBuilder message(String messageContent) {
			this.messageContent = messageContent;
			return this;

		}

		public SendBuilder send_to(String contactAddress) {
			userPage.search_contact(contactAddress);
			userPage.send_message(messageContent);
			return this;
		}

		public void then_logout() {
			userPage.log_out();
			
		}

	}

}
