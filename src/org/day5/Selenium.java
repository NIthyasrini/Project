package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://greenstech.in/selenium-course-content.html");
		
		
		Actions actions = new Actions(driver);
		WebElement mouse1 = driver.findElement(By.xpath("//a[text()='COURSES']"));
		actions.moveToElement(mouse1).perform();
		
		
		WebElement mouse2 = driver.findElement(By.xpath("//span[contains(text(),'SAP Training')]"));
		actions.moveToElement(mouse2).perform();
			
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'SAP MM')]"));
		button.click();
		
				
		WebElement element=driver.findElement(By.xpath("//p[contains(text(),'Greens technology’s selenium')]"));
		String name=element.getText();
		System.out.println(name);
	}
}
