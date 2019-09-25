package org.test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class SeleniumLocators {
		public static void main(String[] args) {
					
			System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver chromedriver = new ChromeDriver();
			chromedriver.get("https://www.instagram.com/accounts/login/?hl=en)");
			
			WebElement userName= chromedriver.findElement(By.xpath("//input[@name='username']"));
			userName.sendKeys("nithya@gmail.com");
			
			WebElement userPass= chromedriver.findElement(By.xpath("//input[@name='password']"));
			userPass.sendKeys("12345");
			
			
					
		}
	}

	
