package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewsPage {
	
	public WebDriver driver;
	
	public ReviewsPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public By reviewsTab = By.cssSelector("a[href='#tab-reviews']");
	public By oneStarRating = By.cssSelector("a[class='star-1']");
	public By twoStarRating = By.cssSelector("a[class='star-2']");
	public By threeStarRating = By.cssSelector("a[class='star-3']");
	public By fourStarRating = By.cssSelector("a[class='star-4']");
	public By fiveStarRating = By.cssSelector("a[class='star-5']");
	public By reviewField = By.cssSelector("textarea[id='comment']");
	public By nameField = By.cssSelector("input[id='author']");
	public By emailField = By.cssSelector("input[id='email']");
	public By saveCheckbox = By.cssSelector("input[id='wp-comment-cookies-consent']");
	public By submitButton = By.cssSelector("input[id='submit']");
	
	public void openReview() {
		driver.findElement(reviewsTab).click();
	}
	
	public void submitReview() {
		driver.findElement(submitButton).click();
	}
	
	public void fillInReviewFields(String comment, String name, String email) {
		driver.findElement(threeStarRating).click();
		driver.findElement(reviewField).sendKeys(comment);
		driver.findElement(nameField).sendKeys(name);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(submitButton).click();
	}
	
	public void acceptJSAlert() {
		driver.switchTo().alert().accept();
	}

}
