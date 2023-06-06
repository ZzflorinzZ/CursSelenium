package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test(priority = 1)
	public void validLoginTest() {
		//MenuPage menu = new MenuPage(driver);
		app.menu.navigateTo(app.menu.loginLink);
		//LoginPage loginPage = new LoginPage(driver);
		app.loginPage.loginInApp("TestUser", "12345@67890");
		assertTrue(app.loginPage.loginMessageIsDisplayed(app.loginPage.successMessage));
		app.loginPage.logoutFromApp();
	}
	
	@Test(priority = 2)
	public void invalidLoginTest() {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp("BadUser", "BadPass");
		assertTrue(loginPage.loginMessageIsDisplayed(loginPage.errorMessage));
	}

}
