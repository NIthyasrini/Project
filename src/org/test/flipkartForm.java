package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartForm {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://www.flipkart.com/");
		
	//	WebElement btnSubmit=chromedriver.findElement(By.xpath("//a[@href=\"/account/login?signup=true\"]"));
	//	btnSubmit.click();
		
		Thread.sleep(5000);
		WebElement mobile =chromedriver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		mobile.sendKeys("nithyatvs@yahoo.com");
		String email =mobile.getAttribute("value");
		System.out.println(email);
		
		WebElement pass =chromedriver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		pass.sendKeys("scabbers");
		String password=pass.getAttribute("value");
		System.out.println(password);
		
		WebElement btnSubmit1=chromedriver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		btnSubmit1.click();
		
		
}
	
}
