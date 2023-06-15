package pages;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookDetailsPage {

	public WebDriver driver;

	public BookDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	public By bookTitle = By.xpath("//h1[contains(@class,'entry-title')]");
	public By bookPrice = By.xpath("(//span[contains(@class,'Price-amount')])[1]");
	public By bookShortDescription = By.xpath("//div[contains(@class,'short-description')]/child::p");
	public By bookQuantity = By.xpath("//div[contains(@class,'quantity')]/descendant::input");
	public By bookShopButton = By.xpath("//form[@class='cart']/descendant::button");
	public By bookCategory = By.xpath("//div[@class='product_meta']/child::span[@class='posted_in']");
	public By bookTags = By.xpath("//div[@class='product_meta']/child::span[@class='tagged_as']");
	public By bookProductID = By.xpath("//div[@class='product_meta']/child::span[@class='product_id']");
	public By bookMagnifyingGlass = By.xpath("//a[contains(@href,'#')][contains(@class,'trigger')]");
	
	public By bookRating = By.xpath("//div[contains(@class,'rating')]/div[@class='star-rating']");
	
	public List<By> bookDetails = new ArrayList<By>();
	
	
	public void createListOfWebElements(By...locators) {
		for(By element : locators) {
			bookDetails.add(element);
		}
	}

	public boolean checkBookDetails(By locator) {
		try {
			driver.findElement(locator).isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
