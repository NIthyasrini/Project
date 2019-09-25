package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		
		Actions actions = new Actions(driver);
		//Thread.sleep(5000);
		WebElement mouse1 = driver.findElement(By.xpath("//span[contains(text(),'Women's Fashion')]"));
		actions.moveToElement(mouse1).perform();
		
	//	WebElement mouse2 = driver.findElement(By.xpath("//span[contains(text(),'Mobile & Tablets')]"));
	//	actions.moveToElement(mouse2).perform();
		
		
		WebElement button=driver.findElement(By.xpath("(//span[contains(text(),'Heels')])[2]"));
		button.click();
}
}
