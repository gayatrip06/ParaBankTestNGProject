package com.application.actions;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.application.elements.OpenNewAccountElements;
import com.framework.utilities.ReadProp;
import com.framework.webdriver.WebDriverClass;

public class OpenNewAccountActions extends OpenNewAccountElements {

Properties prop = ReadProp.readData("Config.properties");
	
	public void launchapplication() {
		driver.get(prop.getProperty("url"));
		wait(2);
		Assert.assertEquals(getPageTitle(), prop.getProperty("title"));
		log("pass","Application is successfully launched");
	}
	
	public void enterUsernameAndPasswordandClickOnSubmitButton() {
		enterInfo(usernameTxtb,prop.getProperty("usernamee"));
		enterInfo(passwordTxtb,prop.getProperty("passwordd"));
		log("info","Username and Password entered");
		clickOnElement(loginBtn);
		waitForElement(accountOverviewPageHeader,10);
		log("pass","Application Login is Successful");
	}
	
	public void verifyNewAccountPage() {
		waitForElement(accountOverviewPageHeader,10);
		
		clickOnElement(openNewAccountLink);
		log("pass","Clicked on Open New Account successfully");
		waitForElement(openNewAccountPageHeader,10);
		log("pass","Open New Account page launched successfully");
	}
	
	public void selectAccountTypeAndExistingAccount() {
		waitForElement(openNewAccountPageHeader,10);
		
		clickOnElement(accountTypeDropBox);
		selectOption(accountTypeDropBox, "index", "1" );
		wait(1);
		clickOnElement(existingAccount);
		selectOption(existingAccount, "index", "1");
		}
	
	public void verifyAccountSuccessfullyCreated() {		
		clickOnElement(openNewAccountSubmitButton);	
		waitForElement(accountOpenedPageHeader,10);
		log("pass","New Account Oppened Successfully");
	}
	
	public static OpenNewAccountActions getNewAccountPage() {
		return PageFactory.initElements(new WebDriverClass().getDriver(), OpenNewAccountActions.class);
	}
	
	}
	

