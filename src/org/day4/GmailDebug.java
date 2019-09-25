package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailDebug {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		WebElement user=driver.findElement(By.id("identifierId"));
		user.sendKeys("srininithya@gmail.com");
		WebElement btnsubmit=driver.findElement(By.xpath("//span[text()='Next']"));
		btnsubmit.click();
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("g1o0g8m5ail$");
		WebElement btnsubmit1=driver.findElement(By.xpath("//span[text()='Next']"));
		btnsubmit1.click();
	}
}
