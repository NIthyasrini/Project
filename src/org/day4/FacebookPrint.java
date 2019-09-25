package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPrint {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement user=driver.findElement(By.id("email"));
	user.sendKeys("srininithya@gmail.com");
	String name=user.getAttribute("value");
	System.out.println(name);
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys("scabbers");
	String pass1=pass.getAttribute("value");
	System.out.println(pass1);
	
	
	
}
}