package curs2;

import org.testng.annotations.Test;

public class TestPriority {
	
	//testNG ruleaza in ordine alfabetica dupa numele metodei
	
	// daca avem metode cu prioritate si fara prioritate, testNG ruleaza intai metodele fara prioritate in ordine alfabetica, apoi metodele cu prioritate
	
	@Test(priority = 0)
	public void one() {
		System.out.println("First");
	}
	
	@Test(priority = 1)
	public void two() {
		System.out.println("Second");
	}
	
	@Test(priority = 2)
	public void three() {
		System.out.println("Third");
	}
	
	@Test(priority = 3)
	public void four() {
		System.out.println("Forth");
	}
	
	@Test(priority = 4)
	public void five() {
		System.out.println("Fifth");
	}

}
