package testNGExamples;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class SouceLabTestExample {
	@Test
	public void BeforeTestdDoThis() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.firefox();
	//	dc.setCapability("version", 46);
	//	dc.setCapability(, value);
		dc.setCapability("name", "Open Google");
		dc.setCapability("Platform", "OS X 10.9");
		System.out.println("Before Test - TestNG");
//		System.setProperty("webdriver.chrome.driver", "C://WebDriver/chromedriver.exe");
//		WebDriver driver  = new ChromeDriver();
		WebDriver driver  = new RemoteWebDriver(new URL("http://patel_97:7b7e8436-9b08-4162-917e-80c121a2cd38@ondemand.saucelabs.com:80/wd/hub"),dc);
		//"http://patel_97:7b7e8436-9b08-4162-917e-80c121a2cd38@ondemand.soucelabs.com:80/wd/hub"
		driver.get("https://www.google.com/");
		driver.quit();
	}
}	