package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashbordPage;
import page.LogingPage;
import util.BrowserFactory;

public class LogingTest {
	
	WebDriver driver;
	String userName = "demo@codefios.com";
	String passWord = "abc123";
	String expectedDashbordText = "Dashboard";
	
	@Test
	public void ValidUserSouldBeAbleToLogin()
	{
		driver = BrowserFactory.init();
		//LogingPage logingpage = new LogingPage(driver);
		LogingPage loginpage = PageFactory.initElements(driver, LogingPage.class);
		loginpage.insertUserName(userName);
		loginpage.insertPassWord(passWord);
		loginpage.clickOnSiginButton();
		DashbordPage dashbordpage = PageFactory.initElements(driver, DashbordPage.class);
		dashbordpage.ValidateDashBordPage(expectedDashbordText);
		BrowserFactory.teardown();
	}

}
