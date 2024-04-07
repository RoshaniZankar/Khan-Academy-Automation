package Module3_TestPage;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KhanAcademyQuizPage 
{
   WebDriver driver;
	@FindBy(xpath = "//button[@class='_8zepmb8']") private WebElement StartQuiz;
	@FindBy(xpath = "//button[@class='_1f0fvyce']") private WebElement LetsGo;
	@FindBy(xpath = "//span[@class='mq-textarea']") private WebElement AnsBox;
	@FindBy(xpath = "//button[@class='_rz7ls7u']") private WebElement Check;
	
	
	public KhanAcademyQuizPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickKhanAcademyQuizPageStartQuiz() 
	{
		StartQuiz.click();
	}
	
	public void ClickKhanAcademyQuizPageLetsGo() 
	{
	    LetsGo.click();	
	}
	
	public void EnterKhanAcademyQuizPageAnsBox(String value) 
	{
	       AnsBox.sendKeys(value);
	}
	
	public void clickKhanAcademyQuizPageCheck() 
	{
		Check.click();
	}
	
	
	
}
