package curs5;

import org.testng.annotations.Test;

import utils.BaseTest;

public class NavigationExample extends BaseTest{
	
	@Test
	public void navigationExample() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://emag.ro");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to("http://altex.ro");
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}

}
