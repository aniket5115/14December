package NeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeostoxUtility.Utility;

public class NeostoxPasswordPage {

	@FindBy(id="txt_accesspin") private WebElement passwordfield;
	@FindBy(xpath="//a[text()='Submit']") private WebElement submitButton;
	
	public NeostoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterPassword(WebDriver driver, String pass)
	{
		Utility.wait(driver, 1000);
		passwordfield.sendKeys(pass);
		Reporter.log("Entering PassWord",true);
	}
	
	public void ClickOnSigninButton(WebDriver driver) throws InterruptedException
	{
		Utility.wait(driver, 1000);
		submitButton.click();
		Reporter.log("Clicking On SignIn Button",true);
		Thread.sleep(10000);
	}
	
	
}
