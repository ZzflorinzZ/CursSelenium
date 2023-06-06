package curs6;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JsAlertsExample extends BaseTest{
	
	@Test
	public void simpleJsAlertTest() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		
		Thread.sleep(3000);
		Alert alertJS = driver.switchTo().alert();
		alertJS.accept();
		//driver.switchTo().alert().accept();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You successfully clicked an alert");
	}
	
	@Test
	public void confirmJsAlertTest() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You clicked: Cancel");
	}
	
	@Test
	public void promptJsAlertTest() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Test");
		driver.switchTo().alert().accept();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You entered: Test");
	}

}
