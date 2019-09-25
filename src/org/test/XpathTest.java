package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("http://demo.automationtesting.in/Register.html");
		
//		WebElement name= chromedriver.findElement(By.xpath("//input[@id='InputName']"));
//		name.sendKeys("Nithya");
		
		WebElement firstName =chromedriver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Nithya");
		
		WebElement lastName=chromedriver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("Srinivasan");	
		
		WebElement address=chromedriver.findElement(By.xpath("//textarea[@ng-model = 'Adress']"));
		address.sendKeys("143, Tower 1, Krish Apartments, Shollinganallur");
		
		WebElement email = chromedriver.findElement(By.xpath("//input[@type = 'email']"));
		email.sendKeys("nithya@gmail.com");
		
		
		
		WebElement phone = chromedriver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9789567890");
		
		WebElement btnGender=chromedriver.findElement(By.xpath("//input[@value = 'FeMale']"));
		btnGender.click();
		
		WebElement btnChkBox1=chromedriver.findElement(By.xpath("//input[@id = 'checkbox1']"));
		btnChkBox1.click();
		
		WebElement btnChkBox2=chromedriver.findElement(By.xpath("//input[@id = 'checkbox2']"));
		btnChkBox2.click();
		
		WebElement btnChkBox3=chromedriver.findElement(By.xpath("//input[@id = 'checkbox3']"));
		btnChkBox3.click();
		
		WebElement pass = chromedriver.findElement(By.xpath("//input[@id='firstpassword']"));
		pass.sendKeys("password");
		
		WebElement pass1 = chromedriver.findElement(By.xpath("//input[@id='secondpassword']"));
		pass1.sendKeys("password");
		
		WebElement btnSubmit=chromedriver.findElement(By.xpath("//button[@id='submitbtn']"));
		btnSubmit.click();
		
		
				
	}
}
