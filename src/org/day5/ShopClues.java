package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		
		
		Actions actions = new Actions(driver);
		WebElement mouse1 = driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
		actions.moveToElement(mouse1).perform();
		
		WebElement button = driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		button.click();
	}
	}

