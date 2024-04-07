package LibraryFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
    public WebDriver driver;
	public void InitializeBrowser() 
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.khanacademy.org/profile/me/courses");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
