package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashbordPage extends BasePage {
	
	WebDriver driver;
	public DashbordPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH,using ="//strong[contains(text(),'Dashboard')]" ) WebElement dashBordHeader;
	@FindBy(how = How.XPATH,using ="//span[text()='Customers']" ) WebElement Customers;
	@FindBy(how = How.XPATH,using = "//span[text()='Add Customer']")WebElement AddCustomer;
	
	public void ValidateDashBordPage(String Dashboard)
	{
		ValidateAssertElement(dashBordHeader,Dashboard);
		
	}
	public void CustomersClickOption() 
	{
		Customers.click();
	}
	public void AddCustomeClickOption()
	{
		AddCustomer.click();
	}

	

}
