package pages;

import utils.BaseTest;

public class BasePage extends BaseTest{
	
	public MenuPage menu = new MenuPage(driver);
	public LoginPage loginPage = new LoginPage(driver);
	public ReviewsPage reviewsPage = new ReviewsPage(driver);
	public NewReleasesPage newReleasesPage = new NewReleasesPage(driver);
	public BooksPage booksPage = new BooksPage(driver);
	public BookDetailsPage bookDetailsPage = new BookDetailsPage(driver);
	public EventsPage eventsPage = new EventsPage(driver);
	
	

}
