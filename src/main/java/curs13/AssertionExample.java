package curs13;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertionExample {
	
	String actualTitle = "Test";
	String expectedTitle = "masina";
	
	@Test
	public void checkEquality() {
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test passed!");
		}else {
			System.out.println("Test Failed");
		}
	}
	
	@Test
	public void checkStringEquality() {
		assertEquals(actualTitle, expectedTitle);
	}
	

}
