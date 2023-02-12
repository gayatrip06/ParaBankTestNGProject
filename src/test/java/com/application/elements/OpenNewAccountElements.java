package com.application.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.framework.commons.WebCommons;

public class OpenNewAccountElements extends WebCommons {
	@FindBy(xpath="//input[@name='username']")
	protected WebElement usernameTxtb;
	
	@FindBy(xpath="//input[@name='password']")
	protected WebElement passwordTxtb;
	
	@FindBy(xpath="//input[@type='submit']")
	protected WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Open New Account']")
	protected WebElement openNewAccountLink;
	
	@FindBy(xpath="//select[@id='type']")
	protected WebElement accountTypeDropBox;
	
	@FindBy(xpath="//select[@id='type']")
	protected WebElement existingAccount;
	
	@FindBy(xpath="//input[@type='submit']")
	protected WebElement openNewAccountSubmitButton;
	
	protected By openNewAccountPageHeader = By.xpath("//h1[text()='Open New Account']");
	
	protected By accountOpenedPageHeader = By.xpath("//h1[@class='title']");
	
	protected By accountOverviewPageHeader = By.xpath("//h2[text()='Account Services']");
	

}
	