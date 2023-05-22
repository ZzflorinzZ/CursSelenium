package homeworkCurs2Selenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginElements {

	public WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://keybooks.ro/");
	}

	@Test
	public void checkLoginElements() {
		WebElement login = driver.findElement(By.cssSelector(".popup_link.popup_login_link.icon-user.inited"));
		assertTrue(true);
		if (driver.findElement(By.cssSelector("input[placeholder=\"Login or Email\"]")).isDisplayed()
				|| driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).isDisplayed()) {
			assertTrue(false);
			login.click();
			if (driver.findElement(By.cssSelector("input[placeholder=\"Login or Email\"]")).isDisplayed()
					|| driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).isDisplayed()) {
				assertTrue(true);
			}
		}
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(8000);
		driver.close();
	}

}
