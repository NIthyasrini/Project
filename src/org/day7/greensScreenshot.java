package org.day7;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class greensScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File s =tk.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File dest= new File("C:\\Users\\RamaKrishnan\\Downloads\\Selenium\\Greens.png");
		FileUtils.copyFile(s, dest);
		
		driver.quit();
		
		
	}
}
