package homeworkCurs2Selenium;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginElements {

	public WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://keybooks.ro/");
	}

	@Test
	public void checkLoginElements() throws InterruptedException {
		WebElement login = driver.findElement(By.cssSelector(".popup_link.popup_login_link.icon-user.inited"));
		WebElement userName = driver.findElement(By.cssSelector("input[placeholder='Login or Email']"));
		WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertFalse(userName.isDisplayed());
		sa.assertFalse(password.isDisplayed());
		login.click();
		Thread.sleep(4000);
		sa.assertFalse(userName.isDisplayed());
		sa.assertTrue(password.isDisplayed());
		sa.assertAll();
		
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}

}
