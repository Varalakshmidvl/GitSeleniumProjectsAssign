package webDriverScreenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utility.Helper1;
import utility.Reusabilitycode;

public class ScreenShotDemo2 {

	WebDriver driver = null;
	@Test
	public void Browser() {
		WebDriver driver =Helper1.startBrowser("Chrome");
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Gmail'124)]")).click();	
	}
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE ==result.getStatus()) {
			Reusabilitycode.capturedScreenShot(driver,result.getName());
		}
		driver.quit();
			
	}
}
