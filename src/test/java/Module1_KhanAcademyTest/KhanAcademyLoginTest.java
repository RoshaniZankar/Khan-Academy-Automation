package Module1_KhanAcademyTest;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFile.BaseClass;
import LibraryFile.UtilityClass;
import Module1_Login.KhanAcademyHomePage;
import Module1_Login.KhanAcademyLoginPage;
import Module3_TestPage.KhanAcademyLogOut;
import Module3_TestPage.KhanAcademyQuizPage;
import dev.failsafe.internal.util.Assert;

public class KhanAcademyLoginTest extends BaseClass
{

	KhanAcademyLoginPage login;
	KhanAcademyHomePage home;
	KhanAcademyQuizPage quiz;
	KhanAcademyLogOut logOut;
	int TCID;
	
	@BeforeClass
	public void EnterUrl() 
	{
		InitializeBrowser();
		
		login=new KhanAcademyLoginPage(driver);
		home =new KhanAcademyHomePage(driver);
		quiz =new KhanAcademyQuizPage(driver);
		logOut =new KhanAcademyLogOut(driver);
		
	}
	
	@BeforeMethod
	public void LoginToApp() throws IOException 
	{
		login.ClickKhanAcademyLoginPageLogin();
	     login.EnterKhanAcademyLoginPageUN(UtilityClass.GetPFD("UN"));	
	     login.EnterKhanAcademyLoginPagePWD(UtilityClass.GetPFD("PWD"));
	     login.ClickKhanAcademyLoginPageLoginBtn();
	}
	
	@Test(priority = 1)
	private void VerifyLogo() throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean actResult = home.VerifyKhanAcademyHomePageLogo();
		org.testng.Assert.assertTrue(actResult, "Failed- Logo Not Found:");
	}
	
	@Test(priority = 2)
	public void SearchClass() throws InterruptedException 
	{
		Thread.sleep(2000);
	  home.clickKhanAcademyHomePageSearchNBtn();
	  home.EnterKhanAcademyHomePageSearchNBtn1(driver);
	  Thread.sleep(2000);
		home.ClickKhanAcademyHomePageCourse();
		home.ClickKhanAcademyHomePageTopic();
	  
	}
	
//	@Test(priority = 3)
//	public void SelectCourse() throws InterruptedException 
//	{
//		Thread.sleep(2000);
//		home.ClickKhanAcademyHomePageCourse();
//		home.ClickKhanAcademyHomePageTopic();
//	}
	
	@Test(priority = 4)
	public void GiveQuiz() throws EncryptedDocumentException, IOException 
	{
		TCID = 101;
		
	   quiz.ClickKhanAcademyQuizPageStartQuiz();
	   quiz.ClickKhanAcademyQuizPageLetsGo();
	   quiz.EnterKhanAcademyQuizPageAnsBox(UtilityClass.GetTD(0, 1));
	   quiz.clickKhanAcademyQuizPageCheck();
	}
	
	@AfterMethod
	public void LogOut(ITestResult s1) throws IOException 
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.CaptureSS(driver, TCID);
		}
	   logOut.ClickKhanAcademyLogOutMail();
	   logOut.ClickKhanAcademyLogOut();
	}
	
	@AfterClass
	public void CloseUrl() 
	{
	  driver.quit();	
	}
	
}
