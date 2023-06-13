package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookDetailsPage {
	
	public WebDriver driver;
	
	public BookDetailsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public By bookTitle = By.xpath("//h1[contains(@class,'entry-title')]");
	public By bookRating = By.xpath("//div[contains(@class,'rating')]/div[@class='star-rating']");
	public By bookPrice = By.xpath("(//span[contains(@class,'Price-amount')])[1]");
	public By bookShortDescription = By.xpath("//div[contains(@class,'short-description')]/child::p");
	public By bookQuantity = By.xpath("//div[contains(@class,'quantity')]/descendant::input");
	public By bookShopButton = By.xpath("//form[@class='cart']/descendant::button");
	public By bookCategory = By.xpath("//div[@class='product_meta']/child::span[@class='posted_in']");
	public By bookTags = By.xpath("//div[@class='product_meta']/child::span[@class='tagged_as']");
	public By bookProductID = By.xpath("//div[@class='product_meta']/child::span[@class='product_id']");
	public By bookMagnifyingGlass = By.xpath("//a[contains(@href,'#')][contains(@class,'trigger')]");
	
	public void checkBookDetailsDisplayed() {
		assertTrue(driver.findElement(bookTitle).isDisplayed());
		assertTrue(driver.findElement(bookRating).isDisplayed());
		assertTrue(driver.findElement(bookPrice).isDisplayed());
		assertTrue(driver.findElement(bookShortDescription).isDisplayed());
		assertTrue(driver.findElement(bookQuantity).isDisplayed());
		assertTrue(driver.findElement(bookShopButton).isDisplayed());
		assertTrue(driver.findElement(bookCategory).isDisplayed());
		assertTrue(driver.findElement(bookTags).isDisplayed());
		assertTrue(driver.findElement(bookProductID).isDisplayed());
		assertTrue(driver.findElement(bookMagnifyingGlass).isDisplayed());
	}
	
	public void checkBookRating() {
		//metoda pt rating
		//pt verificari de tip isDisplayed folosim soft assert
		//lista pt elemente si metoda pt parcurgere lista - for each (in test)
	}

}
