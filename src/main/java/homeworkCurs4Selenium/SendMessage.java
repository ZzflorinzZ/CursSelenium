package homeworkCurs4Selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class SendMessage extends BaseTest {

	@Test
	public void sendContactMessage() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		SoftAssert sa = new SoftAssert();
		
		WebElement contacts = driver.findElement(By.cssSelector("nav[class='menu_main_nav_area'] a[href$='contacts/']"));
//		Thread.sleep(1000);
		contacts.click();
		sa.assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/contacts/");
		
		WebElement name = driver.findElement(By.cssSelector("input[name='your-name'],[placeholder='Name*']"));
		name.sendKeys("Florin");
//		Thread.sleep(1000);
		WebElement email = driver.findElement(By.cssSelector("input[name='your-email'],[placeholder='E-mail*']"));		
		email.sendKeys("florin@gmail.ceva");
//		Thread.sleep(1000);
		WebElement subject = driver.findElement(By.cssSelector("input[name='your-s'],[placeholder='Subject*']"));
		subject.sendKeys("Test");
//		Thread.sleep(1000);
		WebElement message = driver.findElement(By.cssSelector("textarea[name='your-message'],[placeholder='Message*']"));				
		message.sendKeys("CSS selectors test");
//		Thread.sleep(1000);						

		WebElement sendMessageButton = driver.findElement(By.cssSelector("input[type='submit'][value='Send Message']"));
		sendMessageButton.click();
		Thread.sleep(1000);	
		WebElement responseOutput = driver.findElement(By.cssSelector("div[class$='response-output']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", responseOutput);
		assertEquals(responseOutput.getText(), "Thank you for your message. It has been sent.");


						
						
	}
}
