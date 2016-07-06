package testNGExamples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationExpls {
	@BeforeSuite
	public void BeforeTestSuite(){
		System.out.println("Before Test Suite-First One");
	}
	@AfterSuite
	public void AfterTestSuite(){
		System.out.println("After Test Suite-Last One");
	}
	@AfterTest
	public void AfterTestEx(){
		System.out.println("After Test One");
	}
	@BeforeMethod
	public void beforeMethods(){
		System.out.println("Before Each Methods");
	}
	@Test
	public void ActualTestCase(){
		System.out.println("Actual Test Case Example");
	}


}
