package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensOverviewStars {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		TakesScreenshot tk = (TakesScreenshot)driver;
		File source= tk.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\RamaKrishnan\\Downloads\\Selenium\\Greensreview.png");
		FileUtils.copyFile(source,destination);
		driver.quit();
		
	}
}
