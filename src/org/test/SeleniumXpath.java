package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpath {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://www.facebook.com/");
		
//		WebElement name= chromedriver.findElement(By.xpath("//input[@id='InputName']"));
//		name.sendKeys("Nithya");
		
		WebElement email =chromedriver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("nithya@gmail.com");
		
		WebElement pass=chromedriver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("password");	
		
		WebElement btnSubmit=chromedriver.findElement(By.xpath("//input[@value='Log In']"));
		btnSubmit.click();
}
}
