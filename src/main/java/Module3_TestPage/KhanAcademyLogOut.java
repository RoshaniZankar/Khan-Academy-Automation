package Module3_TestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KhanAcademyLogOut 
{

	@FindBy(xpath = "//span[text()='sharadghotekar1995']") private WebElement Email;
	@FindBy(xpath = "//span[text()='Log out']") private WebElement LogOut;
	
	public KhanAcademyLogOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickKhanAcademyLogOutMail() 
	{
	    Email.click();	
	}
	
	public void ClickKhanAcademyLogOut() 
	{
	    LogOut.click();	
	}
	
}
