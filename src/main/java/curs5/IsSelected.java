package curs5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class IsSelected extends BaseTest{
	
	
	//isDisplayed() - se aplica pe orice webelement

	//isSelected() - se aplica doar pe elemente care au type = checkbox sau radio button
	
	//isEnabled - se aplica doar pe elemente de tip input (verifica daca poti sa scrii in el)
	
	@Test
	public void isSelectedExample() {
		driver.findElement(By.cssSelector("li>a[href='#popup_login']")).click();
		
		WebElement rememberMe = driver.findElement(By.cssSelector("div[style^='display'] input[type='checkbox']"));
		
		System.out.println(rememberMe.isSelected());
		rememberMe.click();
		System.out.println(rememberMe.isSelected());
		
		System.out.println("---------------------------------");
		
		WebElement username = driver.findElement(By.id("log"));
		username.click();
		System.out.println(username.isSelected());
	}
	
	

}
