package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class Fail2Tests extends Bootstrap {
	public void test1() {
		driver.get("http://www.google.com");
	}
}
