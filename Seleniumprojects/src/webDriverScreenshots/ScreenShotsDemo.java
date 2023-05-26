package webDriverScreenshots;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Helper1;

public class ScreenShotsDemo {
	
	  @Test
	  public void SS() {
		WebDriver driver =Helper1.startBrowser("Chrome");
		driver.get("http://google.com");
		driver.manage().window().maximize();
		TakesScreenshot ts =(TakesScreenshot)driver;
	       File src= ts.getScreenshotAs(OutputType.FILE);
	        File dest =new File("./Screenshots/S1.png");
	        
	        //Copy the file to a location and use try catch block to handle exception
	        try 
	        {
	        	
	        	FileHandler.copy(src,dest);
	        	
	        } catch (IOException e) {
	            System.out.println("something went wrong"+e.getMessage());
	        }
	     
	        driver.close();
	}
		
	}


