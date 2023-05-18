package curs1;

import org.testng.annotations.Test;

@Test	//functioneaza doar pt metode publice
public class TestAnnotationExample {
	
	//@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	//@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	//@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test
	private void test4() {
		System.out.println("Test 4");
	}

}
