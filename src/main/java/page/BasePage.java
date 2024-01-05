package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage {
	
	public void ValidateAssertElement(WebElement element, String expected) 
	{
		Assert.assertEquals(element.getText(),expected );
		
	}
	public int GenarateNumbers(int boundNum)
	{
	
		Random random = new Random();
		int genarateNumbers = random.nextInt(boundNum);
		return genarateNumbers;	
		
		
		
	}
	
	public void DropDownSelector(WebElement element,String VisibleText)
	{
	
	Select select = new Select(element);
	select.selectByVisibleText(VisibleText);

	}
	
	
}
