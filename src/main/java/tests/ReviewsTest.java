package tests;



import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.BasePage;
import utils.BaseTest;

public class ReviewsTest extends BaseTest{

	@Test
	public void reviewsPageTest() throws InterruptedException {
		
		 app.newReleasesPage.openBook(app.newReleasesPage.storm);
		 app.reviewsPage.openReview();
		 app.reviewsPage.submitReview();
		 app.reviewsPage.acceptJSAlert();
		 app.reviewsPage.fillInReviewFields();
		 app.reviewsPage.submitReview();
		 
		 WebElement awaitingApproval = driver.findElement(By.cssSelector("em[class$='awaiting-approval']"));
		 assertEquals(awaitingApproval.getText(), "Your review is awaiting approval");
	}	
}
