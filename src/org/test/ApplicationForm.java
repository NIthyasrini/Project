package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationForm {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
			
		WebElement email =chromedriver.findElement(By.xpath("//input[@id='navbar_username']"));
		email.sendKeys("nithya@gmail.com");
		
		WebElement pass=chromedriver.findElement(By.xpath("//input[@id='navbar_password']"));
		pass.sendKeys("password");	
		
		WebElement btnRemember=chromedriver.findElement(By.xpath("//input[@id='cb_cookieuser_navbar']"));
		btnRemember.click();	
		
		WebElement btnSubmit=chromedriver.findElement(By.xpath("//input[@value='Log in']"));
		btnSubmit.click();	
	}
}
