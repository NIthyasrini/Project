package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseOver {
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
		

		WebElement button1 = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		button1.click();
		
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("nithyatvs@yahoo.com");
		WebElement button2=driver.findElement(By.id("continue"));
		button2.click();
		WebElement pass=driver.findElement(By.id("ap_password"));
		pass.sendKeys("nit45678");
		
		WebElement button3=driver.findElement(By.id("signInSubmit"));
		button3.click();

	}
}
