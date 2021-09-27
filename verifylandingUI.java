package SiteTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import SitePages.landingPage;
import baseclass.driverFactory;

public class verifylandingUI extends driverFactory {
	
	@Test
	public void verifyTitleText() throws InterruptedException {

	landingPage  landingPage = PageFactory.initElements(driver, landingPage.class);
	landingPage.verifyTitle();
	landingPage.signin();
	landingPage.search_after_login();
	//driver.close();
}
}
