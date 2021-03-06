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
		
	@FindBy(className="text--white")
	private static WebElement Pagetitle;
	@FindBy(xpath= "//input[@type='text'][2]")
	private static WebElement userIncome ;
	@FindBy(xpath="//input[@type='text'][3]")
	private static WebElement otherIncome ;
	@FindBy(xpath="//input[@type='text'][4]")
	private static WebElement livingExpences;
	@FindBy(xpath="//input[@type='text'][5]")
	private static WebElement homeloanRepayment;
	@FindBy(xpath="//input[@type='text'][6]")
	private static WebElement otherloanRepayment;
	@FindBy(xpath="//input[@type='text'][7]")
	private static WebElement otherCommitment;
	@FindBy(xpath="//input[@type='text'][8]")
	private static WebElement creditCardLimits;
	@FindBy(className= "btn btn--action btn--borrow__calculate")
	private static WebElement calculateBorrowButton; 
	@FindBy(id="borrowResultTextAmount")
	private static WebElement borrowResultAmount; 
	@FindBy(className="start-overz")
	private static WebElement starover; 
		//@FindBy(id="nav-logo")
		//private static WebElement pageTitle;
		//@FindBy(xpath="//a[@class='nav-logo-link nav-progressive-attribute']")
		//private static WebElement amazonLogoText;
		//@FindBy(xpath="//div[@class='nav-line-1-container'][1]")
		//private static WebElement signintext;
		//@FindBy(id="ap_email")
		//private static WebElement email;
		//@FindBy(id="continue")
		//private static WebElement continuebutton;
		//@FindBy(id="ap_password")
		//private static WebElement password;
		//@FindBy(id="signInSubmit")
		//private static WebElement login;
		//@FindBy(id="twotabsearchtextbox")
		//private static WebElement searchtextfield;
		//@FindBy(css= "input[type='submit']")
		//private static WebElement searchicon;
	
	public void setvalues() throws InterruptedException
	{
		userIncome.sendKeys("80000");
		otherIncome.sendKeys("10000");
		livingExpences.sendKeys("500");
		homeloanRepayment.sendKeys("0");
		otherloanRepayment.sendKeys("100");
		creditCardLimits.sendKeys("10000");
		
	}
	
	public String calculateBorrow() throws InterruptedException
	
	{
		Thread.sleep(2000);
		calculateBorrowButton.click();
		return("borrowResultAmount.getText()");
	}
	
		
	public void clicksetoverButton() throws InterruptedException
	{
		Thread.sleep(2000);
		starover.click();
		
	}
	
	public void verifydefaultValues() throws InterruptedException
	{
		String actualuserincome = userIncome.getText() ;
		Assert.assertEquals(actualuserincome,"0");
		String actualotherincome = otherIncome.getText() ;
		Assert.assertEquals(actualotherincome,"0");
		String actuallivingExpences = livingExpences.getText() ;
		Assert.assertEquals(actuallivingExpences,"0");
		String actualhomeloanRepayment = homeloanRepayment.getText() ;
		Assert.assertEquals(actualhomeloanRepayment,"0");
		String actualotherCommitment = otherCommitment.getText() ;
		Assert.assertEquals(actualuserincome,"0");
		String actualcreditCardLimits = creditCardLimits.getText() ;
		Assert.assertEquals(actualcreditCardLimits,"0");
		String actualotherCommitment = otherCommitment.getText() ;
		Assert.assertEquals(actualuserincome,"0");
	}
		
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