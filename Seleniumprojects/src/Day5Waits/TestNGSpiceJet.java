package Day5Waits;

import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import utility.Helper1;

public class TestNGSpiceJet {

	@Test
	public void Test() throws InterruptedException {

		//Map<String, Object> prefs = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		//Create an instance of ChromeOptions 
		//ChromeOptions options = new ChromeOptions();
		/* System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chromenew\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();*/
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chromenew\\chromedriver_win32 (1)\\chromedriver.exe");
		//driver = new ChromeDriver(););
		ChromeOptions options = new ChromeOptions();
		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
		//WebDriver driver = new ChromeDriver(options);
		driver.get("http://spicejet.com");	

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.switchTo().frame(1);

		WebElement from =driver.findElement(By.xpath("(//*[@id=\"main-container\"]//input)[1]"));
		from.click();
		from.sendKeys("MAA");
		WebElement To =driver.findElement(By.xpath("(//div[@data-testid='to-testID-destination']"));
		To.click();
		To.sendKeys("HYD");

		//driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).sendKeys("HYD");

		System.out.println("clicking on To");

		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[7]")).click();

		/*
		 * String month="March 2020"; String date="2"; Thread.sleep(5000);
		 */

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='Search Flight']//following-sibling::div")).click();


	}

}
