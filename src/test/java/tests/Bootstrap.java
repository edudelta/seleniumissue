package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class Bootstrap {
	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void testSetup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage", "--no-sandbox", "--headless=new", "--remote-debugging-port=9222");

		driver = new ChromeDriver(options);
	}

	@AfterMethod(alwaysRun = true)
	public void testTeardown() {
		driver.quit();
	}
}
