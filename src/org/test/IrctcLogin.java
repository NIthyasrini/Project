package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcLogin {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement from =chromedriver.findElement(By.xpath("//input[@placeholder='From*']"));
		from.sendKeys("MGR CHENNAI CTL - MAS");
		
		WebElement to =chromedriver.findElement(By.xpath("//input[@placeholder='To*']"));
		to.sendKeys("KSR BENGALURU - SBC");
		
		WebElement btnSubmit1=chromedriver.findElement(By.xpath("//button[@label='Find Trains']"));
		btnSubmit1.click();
		
	}
}
