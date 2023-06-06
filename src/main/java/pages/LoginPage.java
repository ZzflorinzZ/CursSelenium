package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {	//clasele de page object nu au assert-uri
							//assert-urile exista doar in clasele de test

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;		
	}
	//locatori
	public By usernameField = By.id("log");
	public By passwordField = By.id("password");
	public By submitButton = By.cssSelector("input[class='submit_button']");
	public By errorMessage = By.cssSelector("div[class*='sc_infobox_style_error']");
	public By successMessage = By.cssSelector("div[class*='sc_infobox_style_success']");
	public By logoutButton = By.linkText("Logout");
	
	//metode
	public void loginInApp(String user, String pass) {
		driver.findElement(usernameField).sendKeys(user);
		driver.findElement(passwordField).sendKeys(pass);
		driver.findElement(submitButton).click();
	}
	
	public boolean loginMessageIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public void logoutFromApp() {
		driver.findElement(logoutButton).click();
	}
}
