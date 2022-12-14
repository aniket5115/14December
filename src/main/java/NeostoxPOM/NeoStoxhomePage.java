package NeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeostoxUtility.Utility;

public class NeoStoxhomePage {
	
	@FindBy(id="(//a[text='OK'])[2]") private WebElement okbutton;
	@FindBy(xpath="(//a[text='Close'])[5]") private WebElement closeutton;
	@FindBy(id="lbl_username") private WebElement userName;
	@FindBy(xpath="//span[text()='Logout']") private WebElement logoutButton;
	
	public NeoStoxhomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void HandlePopup(WebDriver driver)
	{
		Utility.wait(driver, 1000);
		okbutton.click();
		Reporter.log("Clicking Ok Button",true);
		Utility.wait(driver, 1000);
		closeutton.click();
		Reporter.log("Clicking Close Button",true);
	}
	
	public String getActualUserName(WebDriver driver)
	{
		Utility.wait(driver, 1000);
		String ActualuserName=userName.getText();
		Reporter.log("Getting Actual UserName",true);
		String RealuserName=ActualuserName.substring(3);
		Reporter.log("Getting Actual UserName"+RealuserName,true);
		return actualUserName;
	}
	
	public void logout(WebDriver driver)
	{
		Utility.wait(driver, 1000);
		userName.click();
		Utility.wait(driver, 1000);
		logoutButton.click();
		Reporter.log("Logging Out",true)
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
