package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogingPage {
	
	WebDriver driver;
 
	public LogingPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	//WebElements or Attributes
	//WebElement USERNAMEELEMENT = driver.findElement(By.xpath("//input[@id='user_name']"));
	//By USER_NAME_FEILD = By.xpath("//input[@id='user_name']");
	
	/*Note: in page object model this technique no longer work,for this one we will have to use
	@Findby(how,using). so in this technique how basically is a class and using consider is 
	path.at last we will have to add type*/
	
	

	@FindBy(how = How.XPATH,using ="//input[@id='user_name']" ) WebElement userNmaeElement;
	@FindBy(how = How.XPATH,using = "//input[@id ='password']") WebElement passwordElement;
	@FindBy(how = How.XPATH,using = "//button[@id ='login_submit']") WebElement SigningButtonElement;
			
	
	//Intractable Methods(we can perform it two ways)
	//method one

	public void insertUserName(String userName) 
	{
		userNmaeElement.sendKeys(userName);
	}
	
	public void insertPassWord(String passWord)
	{
		passwordElement.sendKeys(passWord);
	}

	public void clickOnSiginButton()
	{
		SigningButtonElement.click();
	}
	//method two
	
//	public void PerformLogin(String userName,String passWord)
//	{
//		userNmaeElement.sendKeys(userName);
//		passwordElement.sendKeys(passWord);
//		SigningButtonElement.click();
//	}
	
	
	
	
	
	
	
	
}
