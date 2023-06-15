package pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EventsPage {

	public WebDriver driver;

	public EventsPage(WebDriver driver) {
		this.driver = driver;
	}
/*
	public By timeForBooksDiscussion = By.xpath("//a[text()='Time for Books Discussion']");
	public By theArtSeminarSeries = By.xpath("//a[text()='The Art Seminar Series – Joe Cook']");
	public By bookLoversNight = By.xpath("//a[text()='Book Lovers Night']");
	public By poetrySundayEvening = By.xpath("//a[text()='Poetry Sunday Evening']");
	public By festivalOfOldFilms = By.xpath("//a[text()='Festival of Old Films']");
	public By englishSpeakingClub = By.xpath("//a[text()='English Speaking club']");
	public By seminarOfModernArt = By.xpath("//a[text()='Seminar of Modern Art']");
	public By historyOfEnglishLiterature = By.xpath("//a[text()='History of English literature']");
	public By dayOfClasicLiterature = By.xpath("//a[text()='Day of Classic Literature']");
*/	
	public List<By> listOfEvents = new ArrayList<By>();
	public By events = By.xpath("//div[contains(@class,'column_padding_bottom')]");
		

	public By eventUnavailabilityConfirmationText = By.xpath("//li[text()='This event has passed.']");

	public boolean eventAvailabilityConfirmation() {
		try {
			driver.findElement(eventUnavailabilityConfirmationText).isDisplayed();
			return true;
		} catch (NoSuchElementException obj) {
			return false;
		}
	}

}
