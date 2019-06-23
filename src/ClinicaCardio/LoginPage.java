package ClinicaCardio;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	@Test
	public void IntraInSistem_positive_test() {
		System.setProperty("webdriver.chrome.driver","/Users/Utils/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/CentrulCardiologic/login.php");
		
		WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"body\"]/div/div[1]/a/img"));
		LoginButton.click();
		
		String LoginURL = "http://localhost/CentrulCardiologic/sistem.php";
		
		String actualURL = driver.getCurrentUrl();
		
		if (actualURL.equals(LoginURL)){
			System.out.println("Verification Successful - The correct URL is opened.");
		}else{
			System.out.println("Verification Failed - An incorrect Url is opened.");
			//In case of Fail, you like to print the actual and expected URL for the record purpose
			System.out.println("Actual URL is : " + actualURL);
			System.out.println("Expected URL is : " + LoginURL);
		}
		
		WebElement UserName = driver.findElement(By.id("user_from_form"));
		UserName.click();
		UserName.sendKeys("admin");
		
		WebElement Password = driver.findElement(By.id("password_from_form"));
		Password.click();
		Password.sendKeys("admin");
		
		WebElement connect = driver.findElement(By.xpath("//*[@id=\"body\"]/div/form/button[1]"));
		connect.click();
		
		actualURL = driver.getCurrentUrl();
		String SignedInURL = "http://localhost/CentrulCardiologic/index.php";
		
		if (actualURL.equals(SignedInURL)){
			System.out.println("Verification Successful - The correct URL is opened.");
		}else{
			System.out.println("Verification Failed - An incorrect Url is opened.");
			//In case of Fail, you like to print the actual and expected URL for the record purpose
			System.out.println("Actual URL is : " + actualURL);
			System.out.println("Expected URL is : " + SignedInURL);
		}
		
	}
	
	@Test
	public void AdaugaMedic(){
		System.setProperty("webdriver.chrome.driver","/Users/Utils/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/CentrulCardiologic/index.php");
		String actualURL = driver.getCurrentUrl();
		String SignedInURL = "http://localhost/CentrulCardiologic/index.php";
		
		if (actualURL.equals(SignedInURL)){
			System.out.println("Verification Successful - The correct URL is opened.");
		}else{
			System.out.println("Verification Failed - An incorrect Url is opened.");
			//In case of Fail, you like to print the actual and expected URL for the record purpose
			System.out.println("Actual URL is : " + actualURL);
			System.out.println("Expected URL is : " + SignedInURL);
		}
		
		WebElement AddDoctor = driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[2]/a"));
		AddDoctor.click();
		
		actualURL = driver.getCurrentUrl();
		String AddDoctorURL = "http://localhost/CentrulCardiologic/adaugare_medic.php";
		
		if (actualURL.equals(AddDoctorURL)){
			System.out.println("Verification Successful - The correct URL is opened.");
		}else{
			System.out.println("Verification Failed - An incorrect Url is opened.");
			//In case of Fail, you like to print the actual and expected URL for the record purpose
			System.out.println("Actual URL is : " + actualURL);
			System.out.println("Expected URL is : " + AddDoctorURL);
		}
		
		
	} 
}
