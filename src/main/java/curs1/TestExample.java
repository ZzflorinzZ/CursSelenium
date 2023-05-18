package curs1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {

	@Test(invocationCount = 4)
	public void runMultipleTimes() {
		System.out.println("TestNG print");
	}
	
	@RunMultipleTimes(times = 4)	//adnotarea in sine nu are nicio logica implementata, dar ajuta la implementarea unei logici
	public void runMultipleTimes2() {
		System.out.println("Custom print");
	}
	
	
	@BeforeClass
	public void setup() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		TestExample obj = new TestExample();	
		
		for(Method method : obj.getClass().getDeclaredMethods()) {
			if(method.isAnnotationPresent(RunMultipleTimes.class)) {
				RunMultipleTimes annotation = method.getAnnotation(RunMultipleTimes.class);
				for(int i = 0; i<annotation.times(); i++) {
					method.invoke(obj);
				}
			}
		}
	}
	
}
