package curs5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class IsEnabled extends BaseTest{
	
	@Test
	public void isEnabled() {
		
		WebElement loginPopUp = driver.findElement(By.cssSelector("li>a[href='#popup_login']"));
		System.out.println(loginPopUp.isEnabled());
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('disabled', '')", loginPopUp);
		System.out.println(loginPopUp.isEnabled());
		
		System.out.println("=================================");
		
		loginPopUp.click();
		WebElement username = driver.findElement(By.id("log"));
		System.out.println(username.isEnabled());
		jse.executeScript("arguments[0].setAttribute('disabled', '')", username);
		System.out.println(username.isEnabled());
		
		username.sendKeys("TestUser");
	}

}
