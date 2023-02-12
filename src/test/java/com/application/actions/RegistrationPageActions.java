package com.application.actions;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.application.elements.RegistrationPageElements;
import com.framework.utilities.ReadProp;
import com.framework.webdriver.WebDriverClass;

public class RegistrationPageActions extends RegistrationPageElements{
	
	Properties prop = ReadProp.readData("Config.properties");

	public void launchapplication() {
		driver.get(prop.getProperty("url"));
		wait(2);
		Assert.assertEquals(getPageTitle(), prop.getProperty("title"));
		log("pass","Application is successfully launched");
	}
	
	public void verifyRegistrationPage() {
		clickOnElement(registrationLink);
		log("pass","Clicked on Registration link Successfully");
		waitForElement(regTitleLocator,10);
		Assert.assertEquals(getElementText(title),"Signing up is easy!" );
		log("pass", "Application registration page header is as expected");
	}

	public void enterDetails(String fillFirstName, String fillLastName, 
			String fillAddress, String fillCity, String fillState,
			String fillZipCode, String fillPhoneNo, String fillSnn,
			String fillUsername, String fillPassword, String fillConfirmPassword) {	
		
		enterInfo(firstName,fillFirstName);
		enterInfo(lastName,fillLastName);
		enterInfo(address,fillAddress);
		enterInfo(city,fillCity);
		enterInfo(state,fillState);
		enterInfo(zipCode,fillZipCode);
		enterInfo(phoneNumber,fillPhoneNo);
		enterInfo(ssn,fillSnn);
		enterInfo(username,fillUsername);
		enterInfo(password,fillPassword);
		enterInfo(confirmPassword,fillConfirmPassword);
	}
	
	public void verifyRegistrationSuccessfull() {
		clickOnElement(registerButton);
		waitForElement(registrationSuccess,10);
		log("pass","Registration is Successful");
	}
	
	public static RegistrationPageActions getRegisterPage() {
		return PageFactory.initElements(new WebDriverClass().getDriver(), RegistrationPageActions.class);
	}

}
