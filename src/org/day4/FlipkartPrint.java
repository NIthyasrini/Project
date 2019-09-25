package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrint {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
WebDriver chromedriver = new ChromeDriver();
chromedriver.get("https://www.flipkart.com/");

WebElement element1=chromedriver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]"));
String fld1= element1.getText();
System.out.println(fld1);

WebElement element2=chromedriver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[2]"));
String fld2= element2.getText();
System.out.println(fld2);

WebElement element3=chromedriver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[3]"));
String fld3= element3.getText();
System.out.println(fld3);

WebElement element4=chromedriver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[4]"));
String fld4= element4.getText();
System.out.println(fld4);

WebElement element5=chromedriver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[5]"));
String fld5= element5.getText();
System.out.println(fld5);

WebElement element6=chromedriver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[6]"));
String fld6= element6.getText();
System.out.println(fld6);

WebElement element7=chromedriver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[7]"));
String fld7= element7.getText();
System.out.println(fld7);


WebElement element9=chromedriver.findElement(By.xpath("//span[text()='Offer Zone']"));
String fld9= element9.getText();
System.out.println(fld9);




}
}
