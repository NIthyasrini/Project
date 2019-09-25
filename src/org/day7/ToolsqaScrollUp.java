package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsqaScrollUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RamaKrishnan\\\\eclipse-workspace\\\\SeleniumProject\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com//");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement down=driver.findElement(By.xpath("//a[text()='SITEMAP']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		
		WebElement up=driver.findElement(By.xpath("(//span[text()='Selenium in Java'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(false)",up);
		
		//driver.quit();
	
	
	
	}
}
