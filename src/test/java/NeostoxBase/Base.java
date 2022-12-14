package NeostoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;


public class Base {

	    protected WebDriver driver;
		public void Launchbrowser() throws InterruptedException
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinit\\Desktop\\1.Software Testing\\chromedriver.exe");
		    driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://neostox.com/sign-in");
			
			
			
			Reporter.log("Launching Browser",true);
			Thread.sleep(3000);
			}
	
}
