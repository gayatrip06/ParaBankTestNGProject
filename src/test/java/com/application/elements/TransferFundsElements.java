package com.application.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.framework.commons.WebCommons;

public class TransferFundsElements extends WebCommons{
	@FindBy(xpath="//input[@name='username']")
	protected WebElement usernameTxtb;
	
	@FindBy(xpath="//input[@name='password']")
	protected WebElement passwordTxtb;
	
	@FindBy(xpath="//input[@type='submit']")
	protected WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Transfer Funds']")
	protected WebElement transferFundsLink;
	
	@FindBy(xpath="//input[@id='amount']")
	protected WebElement enterAmountBox;
	
	@FindBy(xpath="//select[@id='fromAccountId']")
	protected WebElement fromAccount;
	
	@FindBy(xpath="//select[@id='toAccountId']")
	protected WebElement toAccount;
	

	@FindBy(xpath="//input[@type='submit']")
	protected WebElement transferButton;
	

	protected By transferFundsPageHeader = By.xpath("//h1[text()='Transfer Funds']");

	protected By transferSuccessPageHeader = By.xpath("//h1[text()='Transfer Complete!']");

	protected By accountOverviewPageHeader = By.xpath("//h2[text()='Account Services']");
	
}
