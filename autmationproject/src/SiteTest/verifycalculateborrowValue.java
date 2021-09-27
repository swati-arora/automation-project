package SiteTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import SitePages.landingPage;


public class verifycalculateborrowValue {
	public void verifycalculateborrowvalue() throws InterruptedException 
	{

	landingPage  landingPage = PageFactory.initElements(driver, landingPage.class);
	landingPage.setvalues();
	String actualresult = landingPage.calculateBorrow();
	Assert.assertEquals(actualresult,"$479,000");	
	//driver.close();
}

}
