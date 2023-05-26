package homeworkCurs3Selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class TheForest extends BaseTest {

	@Test
	public void checkTheForest() throws InterruptedException {

		List<WebElement> categories = driver.findElements(By.className("sc_tabs_title"));
		System.out.println(categories.size());
		SoftAssert sa = new SoftAssert();
		int count = 0;

		for (WebElement element : categories) {
			element.click();
			count++;
			Thread.sleep(1000);
			WebElement theForestBook = driver.findElement(By.linkText("The forest"));
			sa.assertTrue(theForestBook.isDisplayed());
			sa.assertAll();
			if (count == 4) {			//assertTrue(categories.get(3).click());
				theForestBook.click();
				assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");
			}
		}
	}
}
