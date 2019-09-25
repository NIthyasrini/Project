import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.opera.OperaDriver;
//import org.openqa.selenium.opera.OperaOptions;

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	/*	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\geckodriver.exe");
		WebDriver firefoxdriver = new FirefoxDriver();
		firefoxdriver.get("http://www.greenstechnologys.com/selenium-course-content.html");

		
		
		OperaOptions options = new OperaOptions();
		options.setBinary("C:\\Users\\RamaKrishnan\\AppData\\Local\\Programs\\Opera\\63.0.3368.71\\Opera.exe");
		System.setProperty("webdriver.opera.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\SeleniumProject\\driver\\operadriver.exe");
		WebDriver operadriver = new OperaDriver(options);
		operadriver.get("https://www.facebook.com");
	*/	
	}
}
