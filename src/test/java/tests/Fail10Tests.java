package tests;

import org.testng.annotations.Test;

@Test
public class Fail10Tests extends Bootstrap {
	public void testWillFail() {
		driver.get("http://www.google.com");
	}
}
