package pages;

import utils.BaseTest;

public class BasePage extends BaseTest{
	
	public MenuPage menu = new MenuPage(driver);
	public LoginPage loginPage = new LoginPage(driver);
	public ReviewsPage reviewsPage = new ReviewsPage(driver);
	public NewReleasesPage newReleasesPage = new NewReleasesPage(driver);
	
	

}
