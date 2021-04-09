package firstmavenproject.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNG {
	WebDriver driver ;

	@BeforeMethod
	public void before() {
WebDriverManager.chromedriver().setup();
driver =new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void getGoogleTitle() {
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void after() {
		//driver.quit();
	}
}
