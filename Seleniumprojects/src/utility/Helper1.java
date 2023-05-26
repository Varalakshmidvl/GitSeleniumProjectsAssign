package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Helper1 {

	public static WebDriver startBrowser(String browser) {
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("Chrome")||browser.equalsIgnoreCase("GC")||browser.equalsIgnoreCase("Google Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chromenew\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
						
		}
		else if(browser.equalsIgnoreCase("Edge")||browser.equalsIgnoreCase("EG")||browser.equalsIgnoreCase("Microsoft Edge")){
			System.setProperty("webdriver.edge.driver","C:\\Selenium\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}else {
			System.out.println("sorry we do not support this browser");
		} return driver;
		
	}
	
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}

	public static WebDriver browserLaunch(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
