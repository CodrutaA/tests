import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

import org.junit.Test;

public class CheckYoutubePage {

	@Test
	public void YoutubePage() {
		System.setProperty("webdriver.gecko.driver","/Users/Utils/geckodriver/geckodriver.exe");
		
		WebDriver browser;
		browser = new FirefoxDriver();
		browser.get("http://www.youtube.com");
		
		browser.close();
	}

}
