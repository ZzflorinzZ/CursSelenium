package curs3;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class SeleniumLocators extends BaseTest{
	
	@Test(priority = 0)
	public void tagNameLocator() {
		WebElement discoverText = driver.findElement(By.tagName("em"));
		System.out.println(discoverText.getText()); // getText() ==> citeste textul elementului
		assertEquals(discoverText.getText(), "Discover");
	}
	
	@Test(priority = 1)
	public void linkTextLocator() {
		WebElement booksLink = driver.findElement(By.linkText("BOOKS"));
		booksLink.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
	}
	
	@Test(priority = 2)
	public void partialLinkTextLocator() {
		WebElement cookingBook = driver.findElement(By.partialLinkText("Cooking"));
		cookingBook.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
	}
	
	@Test(priority = 3)
	public void classNameLocator() {
		WebElement increaseQty = driver.findElement(By.className("q_inc"));
		increaseQty.click();
//		WebElement quantity = driver.findElement(By.className("input-text"));
//		System.out.println(quantity.getText());
	}
	
	@Test(priority = 4)
	public void idLocator() {
		WebElement reviewTab = driver.findElement(By.id("tab-title-reviews"));
		reviewTab.click();
	}
	
	@Test(priority = 5)
	public void xpathLocator() {
		WebElement commentBox = driver.findElement(By.xpath("//textarea[@id='comment']"));
		commentBox.sendKeys("My comment"); //sendKeys ==> trimite text de la tastatura
	}

	@Test(priority = 6)
	public void nameLocator() {
		WebElement nameField = driver.findElement(By.name("author"));
		nameField.sendKeys("Johnny");
	}
	
	@Test(priority = 7)
	public void cssSelectorLocator() {
		WebElement emailField = driver.findElement(By.cssSelector("input[type='email']"));
		emailField.sendKeys("Test@test.com");
	}
}
