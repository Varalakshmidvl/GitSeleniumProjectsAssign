import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGtestDemo {
	
 String BaseUrl = "https:\\www.nocommerce.com/en";
 WebDriver driver;
 @BeforeTest
 @Parameters("chrome")
 public void setUp(String browserName) 
 {
	 System.out.println("Browser name is ..."+browserName);
	 if(browserName.equalsIgnoreCase("chrome")) {
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chromenew\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	
	 }
	 if(browserName.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver","C:\\Selenium\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
		 driver = new EdgeDriver();
	
	 }
 }
 @Test
 public  void BrowserTest() throws InterruptedException {
	 driver.get(BaseUrl);
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
 }
	
@AfterTest	
public void tearDown() {
	driver.quit();
}	

}
