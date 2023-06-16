package tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class EventsTest extends BaseTest {

	@Test
	public void checkEventsAvailability() {
		SoftAssert sa = new SoftAssert();

		app.menu.navigateTo(app.menu.eventsLink);
//		app.eventsPage.listOfEvents.add(app.eventsPage.events); 	//lista are un singur element; nu am stiut cum sa scriu findElements pt un element de tip By
//		System.out.println(app.eventsPage.listOfEvents.size());
		List<WebElement> lista1 = app.eventsPage.listOfEvents();
		
		for (int i=0; i<lista1.size(); i++) {
			lista1 = app.eventsPage.listOfEvents();
			lista1.get(i).click();
			if (app.eventsPage.eventAvailabilityConfirmation()) {
				sa.assertTrue(true);
			} else {
				sa.assertFalse(false);
			}
		//	app.menu.navigateBackW(element);
			app.menu.navigateTo(app.menu.eventsLink);
		}
		
/*		for (WebElement element : lista1) {
			lista1 = app.eventsPage.listOfEvents();
			element.click();
			if (driver.findElement(app.eventsPage.eventUnavailabilityConfirmationText) != null) {
				sa.assertTrue(true);
			} else {
				sa.assertTrue(false);
			}
		//	app.menu.navigateBackW(element);
			app.menu.navigateTo(app.menu.eventsLink);
		}
*/		
		sa.assertAll();

		/*
		 * app.menu.navigateTo(app.eventsPage.timeForBooksDiscussion);
		 * assertTrue(app.eventsPage.eventAvailabilityConfirmation());
		 * 
		 * app.menu.navigateBack(app.eventsPage.theArtSeminarSeries);
		 * app.menu.navigateTo(app.eventsPage.theArtSeminarSeries);
		 * assertTrue(app.eventsPage.eventAvailabilityConfirmation());
		 * 
		 * app.menu.navigateBack(app.eventsPage.bookLoversNight);
		 * app.menu.navigateTo(app.eventsPage.bookLoversNight);
		 * assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		 * 
		 * app.menu.navigateBack(app.eventsPage.poetrySundayEvening);
		 * app.menu.navigateTo(app.eventsPage.poetrySundayEvening);
		 * assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		 * 
		 * app.menu.navigateBack(app.eventsPage.festivalOfOldFilms);
		 * app.menu.navigateTo(app.eventsPage.festivalOfOldFilms);
		 * assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		 * 
		 * app.menu.navigateBack(app.eventsPage.englishSpeakingClub);
		 * app.menu.navigateTo(app.eventsPage.englishSpeakingClub);
		 * assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		 * 
		 * app.menu.navigateBack(app.eventsPage.seminarOfModernArt);
		 * app.menu.navigateTo(app.eventsPage.seminarOfModernArt);
		 * assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		 * 
		 * app.menu.navigateBack(app.eventsPage.historyOfEnglishLiterature);
		 * app.menu.navigateTo(app.eventsPage.historyOfEnglishLiterature);
		 * assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		 * 
		 * app.menu.navigateBack(app.eventsPage.dayOfClasicLiterature);
		 * app.menu.navigateTo(app.eventsPage.dayOfClasicLiterature);
		 * assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		 */
	}

	// de incercat cu o lista de webelemente pe baza de locator comun si un for each cu if
}
