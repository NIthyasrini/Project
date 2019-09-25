package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinPrint {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("srininithya@gmail.com");
		String name=user.getAttribute("value");
		System.out.println(name);
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("scabbers");
		String pass1=pass.getAttribute("value");
		System.out.println(pass1);
		
		
		
	}
}
