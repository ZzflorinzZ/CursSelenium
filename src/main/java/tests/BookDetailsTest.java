package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class BookDetailsTest extends BaseTest {

	/*
	 * @Test(priority = 1) public void validCheckBookDetailsAreDispayed() {
	 * app.menu.navigateTo(app.menu.shopLink);
	 * app.booksPage.openBook(app.booksPage.newGalaxy);
	 * app.bookDetailsPage.checkBookDetailsDisplayed(); }
	 * 
	 * @Test(priority = 2) public void validCheckBookDetailsAreDispayed2() {
	 * app.menu.navigateTo(app.menu.shopLink);
	 * app.booksPage.openBook(app.booksPage.aHundredAndOneRecepies);
	 * app.bookDetailsPage.checkBookDetailsDisplayed(); }
	 * 
	 * @Test(priority = 3) public void invalidCheckBookDetailsAreDispayed() {
	 * app.menu.navigateTo(app.menu.shopLink);
	 * app.booksPage.openBook(app.booksPage.cookingWithLove);
	 * app.bookDetailsPage.checkBookDetailsDisplayed(); }
	 */

	@Test
	public void checkBookDetailsAreDispayed() {
		SoftAssert sa = new SoftAssert();

		app.menu.navigateTo(app.menu.shopLink);
		app.menu.navigateTo(app.booksPage.cookingWithLove);
		app.bookDetailsPage.createListOfWebElements(app.bookDetailsPage.bookTitle, app.bookDetailsPage.bookPrice, app.bookDetailsPage.bookShortDescription, 
													app.bookDetailsPage.bookQuantity, app.bookDetailsPage.bookShopButton, app.bookDetailsPage.bookCategory,
													app.bookDetailsPage.bookTags, app.bookDetailsPage.bookProductID, app.bookDetailsPage.bookMagnifyingGlass);
		System.out.println(app.bookDetailsPage.bookDetails.size());

		for (By element : app.bookDetailsPage.bookDetails) {
			sa.assertTrue(app.bookDetailsPage.checkBookDetails(element));
		}
		
		sa.assertFalse(app.bookDetailsPage.checkBookDetails(app.bookDetailsPage.bookRating)); 
		
		sa.assertAll();
	}
}
