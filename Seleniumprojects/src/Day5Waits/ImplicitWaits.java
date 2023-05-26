package Day5Waits;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.Helper1;
import org.openqa.selenium.support.ui.Select;
public class ImplicitWaits {
	WebDriver driver ;
	@Test
	
public void TestNameDemo() {
		driver = Helper1.startBrowser("GC");
		driver.manage().window().maximize();
		//driver.get("https://www.easemytrip.com");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		
		Select dlist = new Select(driver.findElement(By.id("day")));
		dlist.selectByIndex(0);
		
		WebElement melement = driver.findElement(By.id("month"));
		Select mlist = new Select(melement);
		mlist.selectByValue("5");
		
		Select ylist = new Select(driver.findElement(By.id("year")));
		ylist.selectByVisibleText("1990");
	
	
	
	}
}
