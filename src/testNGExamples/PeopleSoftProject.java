package testNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class PeopleSoftProject {
	@Test
	public void OpenChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C://WebDriver/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Open Chrome Browser Method - TestNG");
	}
	@Test
	public void OpenAnotherChromeBrowser() {
//		System.setProperty("webdriver.chrome.driver", "C://WebDriver/chromedriver.exe");
//		WebDriver driver  = new ChromeDriver();
//		driver.get("google.com");
		System.out.println("Open Another Chrome Browser Method - TestNG");
	}
	@BeforeMethod
	public void BeforeMethodDoThis() {
		System.out.println("Before Each Method - TestNG");
	}
	@BeforeTest
	public void BeforeTestdDoThis() {
		System.out.println("Before Test - TestNG");
	}
	@AfterTest
	public void AfterTestdDoThis() {
		System.out.println("After Test - TestNG");
	}
}
