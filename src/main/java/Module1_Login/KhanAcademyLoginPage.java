package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KhanAcademyLoginPage 
{

	@FindBy(xpath = "//a[text()='Login']") private WebElement Login;
	@FindBy(xpath = "(//input[@class='_1azps1NaN'])[1]") private WebElement UN;
	@FindBy(xpath = "//input[@type='password']") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginBtn;
	
	public KhanAcademyLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickKhanAcademyLoginPageLogin() 
	{
		Login.click();
	}
	
	public void EnterKhanAcademyLoginPageUN(String Username) 
	{
		UN.sendKeys(Username);
	}
	
	public void EnterKhanAcademyLoginPagePWD(String Password) 
	{
		PWD.sendKeys(Password);
	}
	
	public void ClickKhanAcademyLoginPageLoginBtn() 
	{
		LoginBtn.click();
	}
}
