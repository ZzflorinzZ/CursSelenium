package tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class EventsTest extends BaseTest{
	
	@Test
	public void checkEventsAvailability() {
		app.menu.navigateTo(app.menu.eventsLink);
		app.eventsPage.openEvent(app.eventsPage.timeForBooksDiscussion);
		assertTrue(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.theArtSeminarSeries);
		app.eventsPage.openEvent(app.eventsPage.theArtSeminarSeries);
		assertTrue(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.bookLoversNight);
		app.eventsPage.openEvent(app.eventsPage.bookLoversNight);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.poetrySundayEvening);
		app.eventsPage.openEvent(app.eventsPage.poetrySundayEvening);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.festivalOfOldFilms);
		app.eventsPage.openEvent(app.eventsPage.festivalOfOldFilms);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.englishSpeakingClub);
		app.eventsPage.openEvent(app.eventsPage.englishSpeakingClub);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.seminarOfModernArt);
		app.eventsPage.openEvent(app.eventsPage.seminarOfModernArt);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.historyOfEnglishLiterature);
		app.eventsPage.openEvent(app.eventsPage.historyOfEnglishLiterature);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.dayOfClasicLiterature);
		app.eventsPage.openEvent(app.eventsPage.dayOfClasicLiterature);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
	}
	
	//de incercat cu o lista de webelemente pe baza de locator comun si un for each cu if
}
