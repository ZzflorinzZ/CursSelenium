package tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class EventsTest extends BaseTest{
	
	@Test
	public void checkEventsAvailability() {
		app.menu.navigateTo(app.menu.eventsLink);
		app.eventsPage.listOfEvents.add(app.eventsPage.events);
		System.out.println(app.eventsPage.listOfEvents.size());
		
/*		app.menu.navigateTo(app.eventsPage.timeForBooksDiscussion);
		assertTrue(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.theArtSeminarSeries);
		app.menu.navigateTo(app.eventsPage.theArtSeminarSeries);
		assertTrue(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.bookLoversNight);
		app.menu.navigateTo(app.eventsPage.bookLoversNight);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.poetrySundayEvening);
		app.menu.navigateTo(app.eventsPage.poetrySundayEvening);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.festivalOfOldFilms);
		app.menu.navigateTo(app.eventsPage.festivalOfOldFilms);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.englishSpeakingClub);
		app.menu.navigateTo(app.eventsPage.englishSpeakingClub);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.seminarOfModernArt);
		app.menu.navigateTo(app.eventsPage.seminarOfModernArt);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.historyOfEnglishLiterature);
		app.menu.navigateTo(app.eventsPage.historyOfEnglishLiterature);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
		
		app.menu.navigateBack(app.eventsPage.dayOfClasicLiterature);
		app.menu.navigateTo(app.eventsPage.dayOfClasicLiterature);
		assertFalse(app.eventsPage.eventAvailabilityConfirmation());
*/
	}
	
	//de incercat cu o lista de webelemente pe baza de locator comun si un for each cu if
}
