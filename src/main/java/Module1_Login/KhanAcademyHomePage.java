package Module1_Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KhanAcademyHomePage 
{


	
	@FindBy(xpath = "//a[@class='_1ab8w4s7']") private WebElement Logo;
	@FindBy(xpath = "//a[@class='_14nbw552']") private WebElement SearchBtn;
	@FindBy(xpath = "//input[@class='_17onf2xNaN']") private WebElement SearchBtn1;
	@FindBy(xpath = "//a[text()='Class 10 maths (India) | CBSE | Khan Academy']") private WebElement Course;
	@FindBy(xpath = "(//h3[@class='_k50sd54'])[1]") private WebElement Topic;
	
	public KhanAcademyHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean VerifyKhanAcademyHomePageLogo() 
	{
		boolean actResult = Logo.isDisplayed();
		return actResult;
	}
	
	public void clickKhanAcademyHomePageSearchNBtn() throws InterruptedException 
	{
		    SearchBtn.click();
	}
	
	public void EnterKhanAcademyHomePageSearchNBtn1(WebDriver driver) throws InterruptedException 
	{
		SearchBtn1.sendKeys("10th");
    	Thread.sleep(2000);
    	String expText= "10th grade math";
    	
    	 List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='listbox']"));
    	
    	 for( WebElement s1: allOptions)
   	  {
   		  String actText = s1.getText();
   	      if(actText.equals(expText))
   	      {
   	    	  s1.click();
   	    	  break;
   	      }
   	  }
	}
	
	public void ClickKhanAcademyHomePageCourse() 
	{
		Course.click();
	}
	
	public void ClickKhanAcademyHomePageTopic() 
	{
	   Topic.click();	
	}
	
	
	
	
}
