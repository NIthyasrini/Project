package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusRegistration {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://www.redbus.in/");
		

		
		WebElement mobile =chromedriver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		mobile.sendKeys("9997886789");
		
		
		WebElement btnText=chromedriver.findElement(By.xpath("//button[@class = 'buttonText  fb-loaded']"));
		btnText.click();
		
		WebElement email =chromedriver.findElement(By.xpath("//input[@id='email']"));
		mobile.sendKeys("nithya@gmail.com");
		
		WebElement password =chromedriver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("password");
		
		
		WebElement btnlogIn=chromedriver.findElement(By.xpath("//input[@id = 'u_0_0']"));
		btnlogIn.click();
}
}
