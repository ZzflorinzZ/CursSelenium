package curs1;

import org.testng.annotations.*;	// * inseamna All = importa tot

public class BeforeAfterExample {
	
	@BeforeSuite 	//cel mai inalt level de Before
	public void beforeSuite() {
		System.out.println("Before suite");	
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	
	
	@BeforeClass	//ruleaza inainte tuturor metodelor din interiorul unei clase
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	
	//metodele Before si After nu au implementat in interiorul lor o metoda main
	
	
	@BeforeTest		//ruleaza inaintea unei clasei
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeMethod	// se executa inainte si dupa metodele adnotate @Test
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@Test
	public void test() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}

}
