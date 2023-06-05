package homeworkCurs5Selenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class AuthorSkills extends BaseTest{
	
	@Test
	public void checkSkills() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement singleAuthor = driver.findElement(By.cssSelector("ul[class$='sf-arrows'] a[href='/margaret-robins/']"));
		singleAuthor.click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[class$='odd first inited'] div[data-ed='%']"), "95%"));	
		WebElement dramaPercentage = driver.findElement(By.cssSelector("div[class$='odd first inited'] div[data-ed='%']"));
		assertEquals(dramaPercentage.getText(), "95%");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[class$='even inited'] div[data-ed='%']"), "75%"));
		WebElement biographyPercentage = driver.findElement(By.cssSelector("div[class$='even inited'] div[data-ed='%']"));
		assertEquals(biographyPercentage.getText(), "75%");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[class$='odd inited'] div[data-ed='%']"), "82%"));
		WebElement cookbooksPercentage = driver.findElement(By.cssSelector("div[class$='odd inited'] div[data-ed='%']"));
		assertEquals(cookbooksPercentage.getText(), "82%");
	}

}
