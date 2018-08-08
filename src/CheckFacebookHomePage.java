import static org.junit.Assert.*;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.*;

public class CheckFacebookHomePage {

	@Test
	public void testhomepage() {
		
		WebDriver browser;
		
		System.setProperty("webdriver.gecko.driver","/Users/Utils/geckodriver/geckodriver.exe");
		
		browser = new FirefoxDriver();
		
		browser.get("http://facebook.com");
		
		WebElement header = browser.findElement(By.id("blueBarDOMInspector"));
		
		assertTrue((header.isDisplayed()));
		
		browser.close();
		
	}

	@Test
	public void testlogincredentials() {
		
		System.setProperty("webdriver.gecko.driver","/Users/Utils/geckodriver/geckodriver.exe");
		
		WebDriver browser;
		browser = new FirefoxDriver();
		browser.get("http://facebook.com");
		
		WebElement email = browser.findElement(By.id("email"));
		email.click();
		email.sendKeys("ana@yahoo.com");
		
		WebElement password = browser.findElement(By.id("pass"));
		password.click();
		password.sendKeys("123456");
		
		WebElement connect = browser.findElement(By.id("loginbutton"));
		connect.click();
		
		WebElement errormessage = browser.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div"));
		
		if (errormessage.isDisplayed())
		{
			WebElement password2 = browser.findElement(By.id("pass"));
			password2.click();
			password2.sendKeys("56789");
			
			WebElement connect2 = browser.findElement(By.id("loginbutton"));
			connect2.click();
		}

		browser.close();
	}

}
