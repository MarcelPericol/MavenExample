package curs16;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JSEAlertExample extends BaseTest {

	@Test
	public void simpleJsAlert() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("li>button[onclick='jsAlert()']")).click();
		
		Thread.sleep(4000);
		
		
		//handle JS alert
		driver.switchTo().alert().accept();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You successfully clicked an alert");
	}
}
