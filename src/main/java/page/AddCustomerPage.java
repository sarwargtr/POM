package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {
	
	WebDriver driver;
	public AddCustomerPage(WebDriver driver)
	{
	this.driver = driver;	
	}
	

	@FindBy(how = How.XPATH,using ="//strong[text()='New Customer']" ) WebElement NewCustomerHeader;
	@FindBy(how = How.XPATH,using ="//input[@class='form-control name ']") WebElement Full_NameElement;
	@FindBy(how = How.XPATH,using ="//select[@name='company_name']") WebElement companyDPElement;
	@FindBy(how = How.XPATH,using ="//input[@class='form-control email ']") WebElement EmailElement;
	@FindBy(how = How.XPATH,using ="//input[@id='phone']") WebElement PhoneElement;
	@FindBy(how = How.XPATH,using ="//input[@name='address']") WebElement AddressElement;
	@FindBy(how = How.XPATH,using ="//input[@name='city']") WebElement CityElement;
	@FindBy(how = How.XPATH,using ="//input[@id='port']") WebElement ZipCodeElement;
	@FindBy(how = How.XPATH,using ="//select[@name='country']") WebElement CountryDPElement;
	@FindBy(how = How.XPATH,using ="//select[@id='customer_group']") WebElement GroupDPElement;
	
	public void ValidateNewCustomerHeader(String NewCustomer)
	{
		ValidateAssertElement(NewCustomerHeader,NewCustomer);
	}
	public void insertFullName(String FullName)
	{
		Full_NameElement.sendKeys(FullName +GenarateNumbers(999));
	}
	public void selectcompanyDP(String companyName)
	{
		DropDownSelector(companyDPElement,companyName);
	}
	public void insertemail(String email)
	{
		EmailElement.sendKeys(GenarateNumbers(99) + email);
	}

	public void insertphone(String phone)
	{
		PhoneElement.sendKeys(phone);
	}
	public void insertaddress(String address)
	{
		AddressElement.sendKeys(address);
	}
	public void insertcity(String city)
	{
		CityElement.sendKeys(city);
	}
	public void insertzipcode(String zipcode)
	{
		ZipCodeElement.sendKeys(zipcode);
	}
	public void selectCountryDP(String countryName)
	{
		DropDownSelector(CountryDPElement,countryName);
	}
	public void selectGroupDP(String groupName)
	{
		DropDownSelector(GroupDPElement,groupName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
