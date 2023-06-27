package curs14;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;


public class SeleniumLocators extends BaseTest{

	
	@Test(priority=1)
	public void tagNameLocator() {
		WebElement discoverText = driver.findElement(By.tagName("em"));
		//getText() --> returneaza textul unui webElement, adica textul dintre 
		//perechea de <>
		//exemplu: <em> Discover </em>
		System.out.println(discoverText.getText());
		assertEquals(discoverText.getText(), "Discover");
	}
	
	@Test(priority=2)
	public void linkTextLocator () {
		//<a href="https://keybooks.ro/shop/">Books</a>
		driver.findElement(By.linkText("BOOKS")).click();
		//getCurrentUrl() --> returneaza URL-ul curent al paginii
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");		
	}
	
	@Test(priority=3)
	public void partialLinkTextLocator () {
		//<a href="https://keybooks.ro/shop/cooking-with-love/">Cooking with love</a>
		driver.findElement(By.partialLinkText("Cooking")).click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
	}
	
	@Test(priority=4)
	public void classNameLocator () {
		WebElement price = driver.findElement(By.className("price"));
		//isDisplayed() --> verifica daca elementul este afisat si intoarce un boolean
		assertTrue(price.isDisplayed());			
	}
	
	@Test(priority=5)
	public void idLocator () {
		//<li class="reviews_tab" id="tab-title-reviews" role="tab" aria-controls="tab-reviews">
		WebElement reviewsTab = driver.findElement(By.id("tab-title-reviews"));
		assertTrue(reviewsTab.isDisplayed());
		reviewsTab.click();		
	}
	
	@Test(priority=6)
	public void nameLocator () {
		//<textarea id="comment" name="comment" cols="45" rows="8" required=""></textarea>
		WebElement commentBox = driver.findElement(By.name("comment"));
		//sendKeys() --> ne permite sa scriem de la tastatura intr-un element
		commentBox.sendKeys("Test comment");
	}
	
	@Test(priority=7)
	public void cssSelectorLocator () {
		//cssSelector --> tagnameHTML[atribut=valoare atribut]
		//exemplu: input[name='author']
		//<input id="author" name="author" type="text" value="" size="30" required="">
		
		driver.findElement(By.cssSelector("input[name='author']")).sendKeys("Ion");;	
	}
	
	@Test(priority=8)
	public void xpathLocator () {
		//input[@type='email']
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@ion.ro");		
	}
	
}

