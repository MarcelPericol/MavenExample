package curs12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelniumTest {

	@Test
	public void openBrowser () {
		
		WebDriver driver = new ChromeDriver();
						     //FirefoxDriver();
							 //EdgeDriver();
		driver.get("https://keybooks.ro/");
	}	
}
