package Day6HollAndBarretProducts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utility.Helper1;
import org.openqa.selenium.Cookie;
public class ProductsAdd {

	@Test
	public void Products() {
		
	WebDriver driver = Helper1.startBrowser("GC");
	driver.manage().window().maximize();
	driver.get("https://www.hollandandbarrett.com");
	driver.manage().deleteAllCookies();
	
	}
	
	
}
