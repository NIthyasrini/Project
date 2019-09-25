package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsqaForm {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver chromedriver = new ChromeDriver();
	chromedriver.get("http://toolsqa.com/automation-practice-form/");
	

	
	WebElement firstName =chromedriver.findElement(By.xpath("//input[@name='firstname']"));
	firstName.sendKeys("Nithya");
	
	WebElement lastName=chromedriver.findElement(By.xpath("//input[@id='lastname']"));
	lastName.sendKeys("Srinivasan");	
	
	WebElement btnSimple=chromedriver.findElement(By.xpath("//a[@id='cookie_action_close_header']"));
	btnSimple.click();
	
	WebElement btnGender=chromedriver.findElement(By.xpath("//input[@id='sex-1']"));
	btnGender.click();
	
	WebElement btnExperience=chromedriver.findElement(By.xpath("//input[@id='exp-3']"));
	btnExperience.click();
	
	WebElement date=chromedriver.findElement(By.xpath("//input[@id='datepicker']"));
	date.sendKeys("13-09-2019");

	WebElement btnProfession=chromedriver.findElement(By.xpath("//input[@id='profession-0']"));
	btnProfession.click();
	
	WebElement btnTool=chromedriver.findElement(By.xpath("//input[@id='tool-2']"));
	btnTool.click();
	
	
	WebElement btnSubmit=chromedriver.findElement(By.xpath("//button[@id='submit']"));
	btnSubmit.click();
	
	WebElement btnSubmit1=chromedriver.findElement(By.xpath("//button[@id='submit1']"));
	btnSubmit1.click();
	
	WebElement btnSubmit2=chromedriver.findElement(By.xpath("//button[@id='submit2']"));
	btnSubmit2.click();
	
	WebElement btnSubmit3=chromedriver.findElement(By.xpath("//button[@id='submit3']"));
	btnSubmit3.click();
	
	
	
}
}
