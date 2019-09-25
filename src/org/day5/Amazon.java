package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		
		
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		WebElement mouse1 = driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[1]"));
		mouse1.click();
		
		Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//a[contains(text(),'Start here')]"));
		button.click();
			
		WebElement name = driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("Nithya");
		
				
		WebElement phone=driver.findElement(By.id("ap_phone_number"));
		phone.sendKeys("9999999999");
		WebElement pass=driver.findElement(By.id("ap_password"));
		pass.sendKeys("helloamo");
		
		Thread.sleep(5000);
		WebElement button1=driver.findElement(By.id("continue"));
		button1.click();
		
	}
}
