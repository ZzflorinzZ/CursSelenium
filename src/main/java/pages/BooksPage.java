package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BooksPage {
	
	public WebDriver driver;
	
	public BooksPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public By cookingWithLove = By.xpath("//a[text()='Cooking with love']");
	public By newGalaxy = By.xpath("//a[text()='New galaxy']");
	public By aHundredAndOneRecepies = By.xpath("//a[text()='A hundred and one receipes']");
	

}
