  package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashbordPage;
import page.LogingPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	
	
	String userName = "demo@codefios.com";
	String passWord = "abc123";
	String expectedDashbordText = "Dashboard";
	String expectedNewCustomerHeaderText = "New Customer";
	
	String FullName = "sarwar murad";
	String email = "xox@gmail.com";
	String phone = "7866131";
	String address = "1971 north miami ave";
	String city = "miami";
	String zipcode = "33025";
	String companyName = "Techfios";
	String countryName = "Antarctica";
	String groupName = "Selenium";
	
	@Test
	public void userShouldBeAbleToAddCustometr()
	{
		driver = BrowserFactory.init();
		LogingPage loginpage = PageFactory.initElements(driver, LogingPage.class);
		loginpage.insertUserName(userName);
		loginpage.insertPassWord(passWord);
		loginpage.clickOnSiginButton();
		
		DashbordPage dashbordpage = PageFactory.initElements(driver, DashbordPage.class);
		dashbordpage.ValidateDashBordPage(expectedDashbordText);
		dashbordpage.CustomersClickOption();
		dashbordpage.AddCustomeClickOption();
		
		AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
		addcustomerpage.ValidateNewCustomerHeader(expectedNewCustomerHeaderText);
		addcustomerpage.insertFullName(FullName);
		addcustomerpage.selectcompanyDP(companyName);
		addcustomerpage.insertemail(email);
		addcustomerpage.insertphone(phone);
		addcustomerpage.insertaddress(address);
		addcustomerpage.insertcity(city);
		addcustomerpage.insertzipcode(zipcode);
		addcustomerpage.selectCountryDP(countryName);
		addcustomerpage.selectGroupDP(groupName);
	}

}
