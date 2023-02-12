package com.application.scripts;

import org.testng.annotations.Test;

import com.application.actions.LoginPageActions;
import com.application.actions.TransferFundsActions;
import com.framework.webdriver.WebDriverClass;

public class TransferFundsTestScripsts extends WebDriverClass {
	LoginPageActions loginPage;
	TransferFundsActions TransferFundsPage;
	

	@Test(priority = 1, groups = { "Smoke", "Sanity" })
	public void VerifyWhetherApplicationIsLaunchedSuccessfully() {
		loginPage = LoginPageActions.getLoginPage();
		loginPage.launchapplication();
	}

	@Test(priority = 2, groups = { "Regression" })
	public void VerifyTransferFundsPage() {
		loginPage = LoginPageActions.getLoginPage();
		TransferFundsPage = TransferFundsActions.getTransferFundsPage();
		loginPage.launchapplication();
		TransferFundsPage.enterUsernameAndPasswordandClickOnSubmitButton();
		TransferFundsPage.verifyTransferFundsPageHeader();
	}
	
	@Test(priority = 3, groups = { "Regression" })
	public void VerifyTransferFundsProcessComplition() {
		loginPage = LoginPageActions.getLoginPage();
		TransferFundsPage = TransferFundsActions.getTransferFundsPage();
		loginPage.launchapplication();
		TransferFundsPage.enterUsernameAndPasswordandClickOnSubmitButton();
		TransferFundsPage.verifyTransferFundsPageHeader();
		TransferFundsPage.selectTransferFundsDetails();
		TransferFundsPage.verifyTransferFundsSuccessfullyDone();	
	}
}
