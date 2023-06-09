package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewReleasesPage {

	public WebDriver driver;
	
	public NewReleasesPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public By theSon = By.cssSelector("div[class*='first'] a[href='the-son']");
	public By storm = By.cssSelector("div[class*='first'] a[href='storm']");
	
	public void openBook(By locator) {
		driver.findElement(locator).click();
	}

}
