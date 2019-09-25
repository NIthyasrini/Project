package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		
		
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		WebElement mouse1 = driver.findElement(By.xpath("//a[contains(text(),'All Departments')]"));
		actions.moveToElement(mouse1).perform();
		
		
		WebElement mouse2 = driver.findElement(By.xpath("//a[contains(text(),'Heating & Cooling')]"));
		actions.moveToElement(mouse2).perform();
			
		WebElement mouse3 = driver.findElement(By.xpath("//a[contains(text(),'Air Conditioners')]"));
		actions.moveToElement(mouse3).perform();
		
				
		WebElement button=driver.findElement(By.xpath("//a[contains(text(),'Portable Air Conditioners')]"));
		button.click();
		
	}
}
