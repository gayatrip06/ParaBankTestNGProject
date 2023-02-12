package com.application.actions;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.application.elements.TransferFundsElements;
import com.framework.utilities.ReadProp;
import com.framework.webdriver.WebDriverClass;

public class TransferFundsActions extends TransferFundsElements{

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
	
	public void verifyTransferFundsPageHeader() {

		clickOnElement(transferFundsLink);
		log("pass","Clicked on Transfer Funds Link successfully");
		waitForElement(transferFundsPageHeader,10);
		log("pass","Transfer Funds page launched successfully");	
	}
	
	public void selectTransferFundsDetails() {
	wait(2);
	enterInfo(enterAmountBox,"100");
	
	wait(2);
	clickOnElement(fromAccount);
	selectOption(fromAccount, "index" ,"1");
	
	wait(2);
	clickOnElement(toAccount);	
	selectOption(toAccount, "index" ,"1");
	}
	
	public void verifyTransferFundsSuccessfullyDone() {
		clickOnElement(transferButton);
		waitForElement(transferSuccessPageHeader,10);
		log("pass","Funds transferred successfully");
	}
	
	public static TransferFundsActions getTransferFundsPage() {
		return PageFactory.initElements(new WebDriverClass().getDriver(), TransferFundsActions.class);
	}
	
}
