package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraSignup {
	public static void main(String[] args) {
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement email =chromedriver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("nithya@gmail.com");
		
		WebElement pass =chromedriver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("password");
		
		WebElement mobile =chromedriver.findElement(By.xpath("//input[@name='mobile']"));
		mobile.sendKeys("9894234790");
		
		WebElement gender =chromedriver.findElement(By.xpath("//input[@id='female']"));
		gender.click();
		
		WebElement btnSubmit =chromedriver.findElement(By.xpath("//button[@class='register-register-button']"));
		btnSubmit.click();
		
		
	}
}
