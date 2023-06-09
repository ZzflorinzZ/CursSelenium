package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample2 extends BaseTest{
	
	@Test
	public void xpathExample() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//Parent
		WebElement loginPopup = driver.findElement(By.xpath("//a[contains(@class,'popup_login')]/parent::li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", loginPopup);
		loginPopup.click();
		
		//child -- descendant
		// //ul[@id='menu_user']/descendant::form[contains(@class,'popup_form')]/child::div[contains(@class,'login_field')]/child::input[@id='log']
		
		driver.findElement(
				By.xpath("//ul[@id='menu_user']/"
						+ "descendant::form[contains(@class,'popup_form')]/"
						+ "child::div[contains(@class,'login_field')]/"
						+ "child::input[@id='log']")).sendKeys("TestUser");
		
		//descendant
		driver.findElement(
				By.xpath("//ul[@id='menu_user']/"
						+ "descendant::input[@id='password']"))
		.sendKeys("12345@67890");
		
		//following-sibling
		driver.findElement(
				By.xpath("//div[contains(@class,'login_field')]/"
						+ "following-sibling::div[contains(@class,'remember_field')]/input"))
		.click();
		
		//preeciding
		driver.findElement(
				By.xpath("//form[contains(@class,'login_form')]/"
						+ "preceding::input[@class='submit_button']"))
		.click();
	}

}
