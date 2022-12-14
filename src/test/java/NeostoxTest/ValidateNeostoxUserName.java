package NeostoxTest;

import org.junit.BeforeMethod;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


import NeostoxBase.Base;
import NeostoxPOM.NeoStoxLoginPage;
import NeostoxPOM.NeoStoxhomePage;
import NeostoxPOM.NeostoxPasswordPage;
import NeostoxUtility.Utility;

public class ValidateNeostoxUserName extends Base {
	
	NeoStoxLoginPage login;
	NeoStoxhomePage home;
	NeostoxPasswordPage password;
  
	@BeforeClass
	public void launchNeostox() throws InterruptedException
	{
		Launchbrowser();
		login =new NeoStoxLoginPage(driver);
		password =new NeostoxPasswordPage(driver);
		home =new NeoStoxhomePage(driver);
	}
  
  
  @BeforeMethod
  public void logintoNeostox()
  {
	  login.SendMobileNumber(driver, mobnum);
	  login.ClickingsignInbutton(driver);
	  Utility.wait(driver, 1000);
	  password.enterPassword(driver, pass);
	  Utility.wait(driver, 1000);
	  password.ClickOnSigninButton(driver);
	  Thread.sleep(1000);
	  home.HandlePopup(driver);
  }
  
  @Test
  public void ValidateUserId()
  {
	  Assert.assertArrayEquals(home.getActualUserName(driver), actuals);
	  Utility.ScreenShot(driver, SS);
  }
  
  @AfterMethod
  public void logoutfromNeostox()
  {
	  home.logout(driver);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
  
  
  
  
  
  
  
  
  
}
