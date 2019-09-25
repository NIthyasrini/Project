package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyForm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get(" https://www.swiggy.com/");
		
		WebElement btnSubmit=chromedriver.findElement(By.xpath("//a[@class='r2iyh']"));
		btnSubmit.click();
		
		WebElement mobile =chromedriver.findElement(By.xpath("//input[@id='mobile']"));
		mobile.sendKeys("9894234790");
		
		WebElement name =chromedriver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Nithya");
			
		WebElement email =chromedriver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("nithya@gmail.com");
		
		WebElement pass=chromedriver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("password");	
		
		WebElement btnSubmit1=chromedriver.findElement(By.xpath("//a[@class='a-ayg']"));
		btnSubmit1.click();	
	}
	
	
	
	
}
