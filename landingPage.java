package SitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass.driverFactory;

public class landingPage extends driverFactory{
			
		@FindBy(id="nav-logo")
		private static WebElement pageTitle;
		@FindBy(xpath="//a[@class='nav-logo-link nav-progressive-attribute']")
		private static WebElement amazonLogoText;
		@FindBy(xpath="//div[@class='nav-line-1-container'][1]")
		private static WebElement signintext;
		@FindBy(id="ap_email")
		private static WebElement email;
		@FindBy(id="continue")
		private static WebElement continuebutton;
		@FindBy(id="ap_password")
		private static WebElement password;
		@FindBy(id="signInSubmit")
		private static WebElement login;
		@FindBy(id="twotabsearchtextbox")
		private static WebElement searchtextfield;
		@FindBy(css= "input[type='submit']")
		private static WebElement searchicon;
		
		
		public void verifyTitle() throws InterruptedException
		{
		
			Thread.sleep(2000);
			System.out.println(amazonLogoText.getAttribute("aria-label"));
			String actualResult= amazonLogoText.getAttribute("aria-label")+amazonLogoText.getText();
			String actualresultlowercase = actualResult.toLowerCase();
			System.out.println(actualResult);
			System.out.println(actualresultlowercase);
			//Thread.sleep(2000);
			Assert.assertEquals(actualresultlowercase,"amazon.in");		
		}
	   public void signin() throws InterruptedException
	   {
		   Thread.sleep(2000);
		   signintext.click();	 
		   email.sendKeys("swati_tisham@yahoo.com");
		   continuebutton.click();
		   Thread.sleep(1000);
		   password.sendKeys("swati123");
		   login.click();
       }
	   public void search_after_login() throws InterruptedException
	   {
		   Thread.sleep(2000); 
		   searchtextfield.sendKeys("television");
		   searchicon.click();
		
	   }
}