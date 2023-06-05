package homeworkCurs5Selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class BuyABook extends BaseTest{
	
	@Test(priority = 1)
	public void addToCart(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.cssSelector("button[title='Open search']"));
		search.click();
		WebElement inputSearchText = driver.findElement(By.cssSelector("div[class*='top_panel_icon'] input[placeholder='Search']"));
		inputSearchText.sendKeys("the story about me");		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[title='Open search']")));	
		search.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/?s=the+story+about+me");
		WebElement loadMore = driver.findElement(By.cssSelector("span[class='viewmore_text_1']"));
		loadMore.click();
		loadMore.click();		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='post_descr']>h4>a[href*='the-story-about-me']")));		
		WebElement theStoryAboutMe = driver.findElement(By.cssSelector("div[class='post_descr']>h4>a[href*='the-story-about-me']"));
		theStoryAboutMe.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-story-about-me/");
		WebElement addToCart = driver.findElement(By.cssSelector("button[name='add-to-cart']"));
		addToCart.click();
		WebElement addToCartConfirmation = driver.findElement(By.cssSelector("div[role='alert']")); 
		assertTrue(addToCartConfirmation.getText().contains("“The story about me” has been added to your cart.")); 			
		WebElement viewCart = driver.findElement(By.cssSelector("div[role='alert']>a"));
		viewCart.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/cart/");
	}
	
	@Test(priority = 2)
	public void buyTheBook() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='quantity']>input")));		
		WebElement quantity = driver.findElement(By.cssSelector("div[class='quantity']>input"));
		quantity.clear();
		quantity.sendKeys("2");	
		WebElement updateCart = driver.findElement(By.cssSelector("button[name='update_cart']"));
		updateCart.click();
		WebElement updateCartConfirmation = driver.findElement(By.cssSelector("div[role='alert']"));
		assertEquals(updateCartConfirmation.getText(), "Cart updated.");		
		WebElement checkout = driver.findElement(By.cssSelector("a[class^='checkout-button']"));
		checkout.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/checkout/");
		WebElement billingDetails = driver.findElement(By.cssSelector("div[class*='billing']>h3"));
		assertEquals(billingDetails.getText(), "Billing details");
		WebElement additionalInfo = driver.findElement(By.cssSelector("div[class$='additional-fields']>h3"));
		assertEquals(additionalInfo.getText(), "Additional information");		
	}
	
}
