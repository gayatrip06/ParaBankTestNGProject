package com.application.scripts;

import org.testng.annotations.Test;

import com.application.actions.ForgotLoginPageActions;
import com.application.actions.LoginPageActions;
import com.application.actions.RegistrationPageActions;
import com.framework.webdriver.WebDriverClass;

public class RegistrationPageTestScripts extends WebDriverClass {

	LoginPageActions loginPage;
	RegistrationPageActions registrationPage;

	@Test(priority = 1, groups = { "Smoke", "Sanity" })
	public void VerifyWhetherApplicationIsLaunchedSuccessfully() {
		loginPage = LoginPageActions.getLoginPage();
		loginPage.launchapplication();
	}
	
	@Test(priority = 2, groups = { "Regression" })
	public void VerifyRegistrationPageHeader() {
		loginPage = LoginPageActions.getLoginPage();
		registrationPage = RegistrationPageActions.getRegisterPage();
		
		loginPage.launchapplication();
		registrationPage.verifyRegistrationPage();
	}
	
	@Test(priority = 3, groups = { "Smoke", "Sanity", "Regression" }, dataProvider="testdata")
	public void VerifyRegistrationPageFeature(String fillFirstName, String fillLastName, String fillAddress, String fillCity, String fillState,
			String fillZipCode, String fillPhoneNo, String fillSnn, String fillUsername, String fillPassword, String fillConfirmPassword) {
		
		loginPage = LoginPageActions.getLoginPage();
		registrationPage = registrationPage.getRegisterPage();
		
		loginPage.launchapplication();	
		registrationPage.verifyRegistrationPage();
		registrationPage.enterDetails(fillFirstName, fillLastName, fillAddress, fillCity, fillState, fillZipCode, fillPhoneNo, fillSnn, fillUsername, fillPassword, fillConfirmPassword);
		registrationPage.verifyRegistrationSuccessfull();
	}

	
}
