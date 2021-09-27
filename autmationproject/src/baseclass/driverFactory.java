package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class driverFactory {
	
	protected WebDriver driver;
 
  @BeforeMethod
  
  public void launchBrowser() throws InterruptedException{
	  //System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
  }
}
