package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample extends BaseTest{

	@Test
	public void xpathExampleTest() {
		
		//css => li[class='menu_user_login']
		//xpt =>//li[@class='menu_user_login']
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		driver.findElement(By.xpath("//li[@class='menu_user_login']")).click();
		
		
		//OR
		WebElement usernameField = driver.findElement(By.xpath("//input[@id='log' or @name='log']"));
	
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", usernameField);
		usernameField.sendKeys("TestUser");
		
		//AND
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='password' and @name='pwd']"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", passwordField);
		passwordField.sendKeys("12345@67890");
	}
}
