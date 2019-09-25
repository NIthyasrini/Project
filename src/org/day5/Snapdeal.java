package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		WebElement mouse1 = driver.findElement(By.xpath("//span[contains(text(),'Mobile & Tablets')]"));
		actions.moveToElement(mouse1).perform();
		
		
		WebElement button=driver.findElement(By.xpath("//span[contains(text(),'New Launches Covers')]"));
		button.click();
}
}