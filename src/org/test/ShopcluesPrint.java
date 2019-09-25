package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopcluesPrint {
	public static void main(String[] args) {
		//input[@placeholder='What are you looking for?']
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get(" https://www.shopclues.com/wholesale.html ");
	
		WebElement element =chromedriver.findElement(By.xpath("//input[@placeholder='What are you looking for?']"));
		element.sendKeys("fasttrack watches");
		
		WebElement btnSubmit=chromedriver.findElement(By.xpath("//a[@class='srch_action btn orange']"));
		btnSubmit.click();
	}
}
