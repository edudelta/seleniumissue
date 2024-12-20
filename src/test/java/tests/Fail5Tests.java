package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class Fail5Tests extends Bootstrap {
	public void test1() {
		driver.get("http://www.google.com");
	}
}
