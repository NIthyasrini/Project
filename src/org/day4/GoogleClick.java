package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("greens velmurugan");
		
		WebElement element1=driver.findElement(By.xpath("//span[text()='greens']"));
		element1.click();
		
		WebElement button=driver.findElement(By.xpath("//input[@name='btnK'][1]"));
		button.click();
	}
}
