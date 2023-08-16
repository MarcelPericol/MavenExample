package curs16;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JsEAlertExample extends BaseTest {

	@Test(priority = 1)
	public void simpleJsAlert() throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("li>button[onclick='jsAlert()']")).click();
		
		Thread.sleep(4000);
		//handle JS alert
		driver.switchTo().alert().accept();
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You successfully clicked an alert");
		
		
	}
	
	@Test(priority = 2)
	public void confirmationJSAlert() throws InterruptedException {
		
		driver.findElement(By.cssSelector("li>button[onclick='jsConfirm()']")).click();
		Thread.sleep(4000);
		//recomandata pentru 1 singura actiune
		driver.switchTo().alert().dismiss();
		
		//recomandat pentru mai multe actiuni succesive -- se creeaza un obiect care este ulterior chemat
		//Alert alertaJS = driver.switchTo().alert();
		//alertaJS.dismiss();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You clicked: Cancel");
	}
	
	@Test(priority = 3)
	public void promptJSAlert() throws InterruptedException {
		
		driver.findElement(By.cssSelector("li>button[onclick='jsPrompt()']")).click();
		Thread.sleep(4000);
		
		driver.switchTo().alert().sendKeys("Test");
		driver.switchTo().alert().accept();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You entered: Test");
	}
}
