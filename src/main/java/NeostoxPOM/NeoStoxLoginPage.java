package NeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


import NeostoxUtility.Utility;

public class NeoStoxLoginPage {
	
	
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber") private WebElement mobilenumField;
	@FindBy(xpath="(//a[text()='Sign In'])[2]") private WebElement signinButton;
	
	
	public NeoStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void SendMobileNumber(WebDriver driver, String mobnum)
	{
		Utility.wait(driver, 1000);
		mobilenumField.sendKeys(mobnum);
		Reporter.log("Entering Mobile Number",true);
	}
	
	public void ClickingsignInbutton(WebDriver driver)
	{
		Utility.wait(driver, 1000);
		signinButton.click();
		Reporter.log("Clicking SignIn Button",true);
	}
	
	
	
	
	
	
	

}
