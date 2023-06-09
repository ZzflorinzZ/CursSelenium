package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample extends BaseTest{

	@Test(priority = 1)
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
		
		//multiple elements
		WebElement submitButton = driver.findElement(By.xpath("//ul//input[@class='submit_button']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", submitButton);
		submitButton.click();
	}
	
	@Test(priority = 2)
	public void xpathExample2() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		driver.findElement(By.xpath("//span[@class='user_name']")).click();
		
		//CONTAINS
		//xpath: //a[contains(@class,'icon-cog')]
		
		driver.findElement(By.xpath("//a[contains(@class,'icon-cog')]")).click();
		
		//identificam pe baza textului dintre tag-urile HTML > <
		// functia ==> text()		
		driver.findElement(By.xpath("//a[text()='recent orders']")).click();
		
		//direct child si contains(text(),'valoare')
		WebElement orderTableHeader = driver.findElement(By.xpath("//th[contains(@class,'woocommerce-orders-table__header')]/span[contains(text(),'Order')]"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", orderTableHeader);
		
		//index based
		WebElement statusTableHeader = driver.findElement(By.xpath("(//th[contains(@class,'woocommerce-orders-table__header')]/span)[3]"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", statusTableHeader);
		
		//multiple attributes
		WebElement order1721 = driver.findElement(By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell')][@data-title='Order']/a[contains(text(),'#1721')]"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", order1721);
		
		//NOT
		WebElement order = driver.findElement(By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell')][@data-title='Order']/a[not(contains(text(),'#1721'))]"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red')", order);
	}
	
	
	//starts-with
	
	
	
}
