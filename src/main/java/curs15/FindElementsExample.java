package curs15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class FindElementsExample  extends BaseTest{
	
	
	@Test
	public void findElementsExample() {
		
		List<WebElement> bookPictures = driver.findElements(By.className("sc_image"));
		System.out.println(bookPictures.size());
		WebElement poza1 = bookPictures.get(1);
		WebElement poza2 = bookPictures.get(2);
		WebElement poza3 = bookPictures.get(3);
		WebElement poza0 = bookPictures.get(0);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'border:10px solid red')", poza3);

		
		
	}

}
