package curs2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebElementExample {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://keybooks.ro/");
		
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}
	
	@Test 
	public void webElementExample() {
		System.out.println(driver.getTitle());
		WebElement loginmenu = driver.findElement(By.className("menu_user_login"));
		loginmenu.click();
	}
	

}
