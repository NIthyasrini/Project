package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensCoreJava {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement btnSubmit=chromedriver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
		btnSubmit.click();
}
}
