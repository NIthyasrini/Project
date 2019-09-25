package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.manage().window().maximize();
		chromedriver.get("https://www.cleartrip.com/trains");
		
		
	/*	WebElement fromStation =chromedriver.findElement(By.xpath("//input[@id='from_station']"));
		fromStation.sendKeys("Chennai Central (MAS)");
		
		WebElement destStation=chromedriver.findElement(By.xpath("//input[@id='to_station']"));
		destStation.sendKeys("Bangalore Cant (BNC)");	
		
		*/
		WebElement btnSubmit=chromedriver.findElement(By.xpath("//a[@href='/register']"));
		btnSubmit.click();
		
		WebElement email =chromedriver.findElement(By.xpath("//input[@id='username1']"));
		email.sendKeys("srininithya@gmail.com");
		
		//button[@id='registerButton']
		WebElement btnSubmit1=chromedriver.findElement(By.xpath("//button[@id='registerButton']"));
		btnSubmit1.click();
		
		WebDriverWait wait=new WebDriverWait(chromedriver,10);
		
		WebElement pass =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")));
		pass.click();
		pass.sendKeys("Nithya1111$");
		
		WebElement title =chromedriver.findElement(By.xpath("//select[@id='profile_title']"));
		title.sendKeys("Ms");
		
		WebElement firstName =chromedriver.findElement(By.xpath("//input[@name='first_name']"));
		firstName.sendKeys("Nithya");
		
		WebElement lastName =chromedriver.findElement(By.xpath("//input[@name='last_name']"));
		lastName.sendKeys("Srinivasan");
		
		WebElement phone =chromedriver.findElement(By.xpath("//input[@name='phone_number_value']"));
		phone.sendKeys("9894234790");
		
		WebElement btnSubmit2=chromedriver.findElement(By.xpath("//button[@id='signUpButton']"));
		btnSubmit2.click();
		
	}

}