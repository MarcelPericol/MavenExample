package curs17;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ImplicitWait extends BaseTest {

	@Test(priority = 1)
	public void implicitWaitExample () throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		
		//Thread.sleep(8000);//bad practice
		
		WebElement finish = driver.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finish.getText(),"Hello World!");
				
	}
	
	
}
