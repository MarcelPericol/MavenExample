package curs15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectors extends BaseTest{

	//@Test
	public void cssSelectors() {
		
		//#menu_user --> gaseste orice element care are atributul ID(#) egal cu menu_user
		//ul#menu_user --> gaseste orice element de tip UL care are ID(#) egal cu menu_user
		//ul[id='menu_user']
		WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
		//loginMenu.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'border:10px solid red')", loginMenu);

		// . --> class
		//div.logo_slogan
		WebElement logo = driver.findElement(By.cssSelector(".logo_slogan"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:10px solid red')", logo);

		WebElement inspireText = driver.findElement
				(By.cssSelector("div[class='column-1_2 sc_column_item sc_column_item_2 even'] h3.sc_title_underline"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:10px solid red')", inspireText);
		
		//face scroll pana la element
		
		//jse.executeScript("arguments[0].scrollIntoView();", inspireText);
		Actions action =  new Actions(driver);
		action.moveToElement(inspireText).perform();
		
		
	}
	
	//@Test
	public void cssSelector2() {
		
		driver.findElement(By.cssSelector("li[class='menu_user_login']")).click();
		
		//AND
		driver.findElement(By.cssSelector("input[id='log'][name='log'][placeholder='Login or Email']")).sendKeys("Test");
		
		//OR
		driver.findElement(By.cssSelector("input[type='password'],[name='pwd']")).sendKeys("test");
		
		//direct child
		driver.findElement(By.cssSelector("div[class='popup_form_field remember_field']>input")).click();
		
		//nephew
		driver.findElement(By.cssSelector("form[class='popup_form login_form'] input[class='submit_button']")).click();
			
	}
	
	@Test
	public void cssSelectors3() {
		
		// * --> contains
		WebElement bookTitle = driver.findElement(By.cssSelector("h3[class*='sc_title_reg']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'border:10px solid red')", bookTitle);
		jse.executeScript("window.scrollBy(0, 500)");
			
		// ~ --> contains word
		WebElement bookAuthor =  driver.findElement(By.cssSelector("p[style~='center;']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:10px solid red')", bookAuthor);
		
		// ^ --> starts-with
		WebElement book = driver.findElement(By.cssSelector("a[href^='life-']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:10px solid red')", book);
		
		// $ --> end-with
		WebElement bookSilence =  driver.findElement(By.cssSelector("a[href$='silence']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:10px solid red')", bookSilence);

		
	}
	
}
