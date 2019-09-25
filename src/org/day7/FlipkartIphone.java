package org.day7;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	WebElement close= driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	close.click();
	WebElement search= driver.findElement(By.name("q"));
	search.sendKeys("iphone");
	WebElement button=driver.findElement(By.xpath("//button[@class='vh79eN']"));
	button.click();
	Thread.sleep(5000);
	
	WebElement button1=driver.findElement(By.xpath("//div[text()='Apple iPhone XR (Black, 64 GB)']"));
	button1.click();
	
	String parent= driver.getWindowHandle();
	System.out.println(parent);
	
	Set<String> all=driver.getWindowHandles();
	System.out.println(all);
	
	for(String x:all) {
		if(!parent.equals(x)) {
			driver.switchTo().window(x);
		}
	
	TakesScreenshot tk=(TakesScreenshot) driver;
	File src =tk.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\RamaKrishnan\\Downloads\\Selenium\\Greens.png");
	FileUtils.copyFile(src,dest);
	}
}
}