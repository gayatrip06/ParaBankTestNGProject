package com.application.scripts;

import org.testng.annotations.Test;

import com.application.actions.ForgotLoginPageActions;
import com.application.actions.LoginPageActions;
import com.application.actions.OpenNewAccountActions;
import com.framework.webdriver.WebDriverClass;

public class OpenNewAccountTestScripsts extends WebDriverClass{
	LoginPageActions loginPage;
	OpenNewAccountActions openNewAccountPage;

	@Test(priority = 1, groups = { "Smoke", "Sanity" })
	public void VerifyWhetherApplicationIsLaunchedSuccessfully() {
		loginPage = LoginPageActions.getLoginPage();
		loginPage.launchapplication();
	}

	@Test(priority = 2, groups = { "Regression" })
	public void VerifyNewAccountPageHeader() {
		loginPage = LoginPageActions.getLoginPage();
		openNewAccountPage = OpenNewAccountActions.getNewAccountPage();
		
		loginPage.launchapplication();
		openNewAccountPage.enterUsernameAndPasswordandClickOnSubmitButton();
		openNewAccountPage.verifyNewAccountPage();
	}

	@Test(priority = 3, groups = { "Regression" })
	public void verifyCreateNewAccount() {
		loginPage = LoginPageActions.getLoginPage();
		openNewAccountPage = OpenNewAccountActions.getNewAccountPage();
		
		loginPage.launchapplication();
		openNewAccountPage.enterUsernameAndPasswordandClickOnSubmitButton();
		openNewAccountPage.verifyNewAccountPage();
		openNewAccountPage.selectAccountTypeAndExistingAccount();
		openNewAccountPage.verifyAccountSuccessfullyCreated();
	}
}
