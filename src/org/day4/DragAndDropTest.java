package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Actions actions = new Actions(driver);
		WebElement src = driver.findElement(By.id("fourth"));
		WebElement dest = driver.findElement(By.id("amt7"));
		actions.dragAndDrop(src,dest).perform();
		
		
		WebElement src1 = driver.findElement(By.id("fourth"));
		WebElement dest1 = driver.findElement(By.id("amt8"));
		actions.dragAndDrop(src1,dest1).perform();
		
		WebElement src2 = driver.findElement(By.id("credit2"));
		WebElement dest2 = driver.findElement(By.id("bank"));
		actions.dragAndDrop(src2,dest2).perform();
		
		WebElement src3 = driver.findElement(By.id("credit1"));
		WebElement dest3 = driver.findElement(By.id("loan"));
		actions.dragAndDrop(src3,dest3).perform();
		
		WebElement correct = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String s=correct.getText();
		System.out.println(s);
		String s1="Perfect!";
		if(s.equals(s1))
					System.out.println("The word perfect is printed");
		else
			System.out.println("The word perfect is not printed");
	}
}
