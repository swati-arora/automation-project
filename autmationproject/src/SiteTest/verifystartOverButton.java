package SiteTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import SitePages.landingPage;
import baseclass.driverFactory;

public class verifystartOverButton {
	@Test
	public void verifystartoverButton() throws InterruptedException {

	landingPage  landingPage = PageFactory.initElements(driver, landingPage.class);
	landingPage.clicksetoverButton();
	landingPage.clicksetoverButton();
	//driver.close();

}
}