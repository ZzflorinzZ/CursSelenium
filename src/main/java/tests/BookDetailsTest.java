package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class BookDetailsTest extends BaseTest{
	
	@Test(priority = 1)
	public void validCheckBookDetailsAreDispayed() {
		app.menu.navigateTo(app.menu.shopLink);
		app.booksPage.openBook(app.booksPage.newGalaxy);
		app.bookDetailsPage.checkBookDetailsDisplayed();
	}
	
	@Test(priority = 2)
	public void validCheckBookDetailsAreDispayed2() {
		app.menu.navigateTo(app.menu.shopLink);
		app.booksPage.openBook(app.booksPage.aHundredAndOneRecepies);
		app.bookDetailsPage.checkBookDetailsDisplayed();
	}
	
	@Test(priority = 3)
	public void invalidCheckBookDetailsAreDispayed() {
		app.menu.navigateTo(app.menu.shopLink);
		app.booksPage.openBook(app.booksPage.cookingWithLove);
		app.bookDetailsPage.checkBookDetailsDisplayed();
	}

}
