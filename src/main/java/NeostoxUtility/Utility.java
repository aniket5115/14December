package NeostoxUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;



public class Utility {       //  // Commonly used Methods

                                                                                                
		public static String readDataFromExel(int row, int cell) throws EncryptedDocumentException, IOException          // Excel Reading
		{
			File myfile=new File("C:\\Users\\Vinit\\Desktop\\Software Testing\\Excel1.xlsx");
			
			String value=WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(row).getCell(cell).getStringCellValue();
			Reporter.log("Reading data from Excell");
			
			return value;
		}
	                                                                             
		public static void ScreenShot(WebDriver driver, String SS) throws IOException                   // ScreenShot	
		{
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Vinit\\Desktop\\Software Testing\\" +SS+".png");
			FileHandler.copy(source, dest);
		
		}
		
		public static void ScrollIntoView(WebDriver driver, WebElement element)            // Scrolling Into View
		{
			wait(driver,500);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			
		}
		
       public static void wait(WebDriver driver, int waitTime)                                       // Wait
       {
    	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
    	 
    	   
       }

		
}
	
	
	
	
	
	
	


