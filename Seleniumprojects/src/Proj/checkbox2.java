package Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.Helper1;
public class checkbox2 {
	
@Test
public void TestCB() {
		  WebDriver driver = Helper1.startBrowser("GC");	
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/VA20319793/Desktop/Butterandcheese.html");
	

 driver.findElement(By.xpath("//input[@name='option1']")).click();
 WebElement checkbox = driver.findElement(By.xpath("//input[@name='option1']"));
	checkbox.click();

 if (checkbox.isSelected()) {
	 System.out.println("Checkbox is selected");
 } 
 else {
	System.out.println("Checkbox is not selected");
     }
 checkbox.click();
	
 	 if (!checkbox.isSelected()) {

	 System.out.println("Checkbox is toggle off....!!");
	
	 }
driver.quit();
}

}
