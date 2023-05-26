package utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Reusabilitycode {
	
public static void capturedScreenShot(WebDriver driver, String screenShotName) 
{
	try
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source,new File("./ScreenshotsOnFailure/" + screenShotName + ".png"));
		System.out.println("Captured ScreenShot - By Selenium WebDriver");
	}
     catch(Exception e){
    	 System.out.println("Exception While Taking Screen Shot" + e.getMessage());
     }

}
}