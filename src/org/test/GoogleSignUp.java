package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignUp {
	public static void main(String[] args) {
		
	
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

		WebElement firstName =chromedriver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Nithya");

		WebElement lastName=chromedriver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Srinivasan");	
		
		
		WebElement username=chromedriver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("srinivasannithya02");	
		
		WebElement pass=chromedriver.findElement(By.xpath("//input[@name='Passwd']"));
		pass.sendKeys("n1i1t1h1ya$");	
		
		WebElement pass1=chromedriver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		pass1.sendKeys("n1i1t1h1ya$");
		
		WebElement btnNext=chromedriver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		btnNext.click();
		
		//WebElement phNo=chromedriver.findElement(By.xpath("//input[@id='phoneNumberId']"));
		//phNo.sendKeys("9894234790");
		
		

}
}
