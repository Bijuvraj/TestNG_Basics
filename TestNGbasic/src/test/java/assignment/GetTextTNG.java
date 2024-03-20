package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextTNG {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/simple-form-demo.php");
			driver.manage().window().maximize();
		}
	@Test
	public void verify_the_ShowMessage_Button_Text()
	{
		WebElement showMsgButton = driver.findElement(By.xpath("//button[text()='Show Message']"));
		String expectedResult = "Show Message";
		String actualResult = showMsgButton.getText();
		Assert.assertEquals(actualResult, expectedResult);	
	}
	@Test
	public void verify_bgColor_of_ShowMsg_Button()
	{
		WebElement showMsgButtonBGcolor = driver.findElement(By.xpath("//button[text()='Show Message']"));
		String expectedResult =showMsgButtonBGcolor.getCssValue("color");
		String actualResult = showMsgButtonBGcolor.getCssValue("color");
		System.out.println(showMsgButtonBGcolor.getCssValue("color"));
		Assert.assertEquals(actualResult, expectedResult);
	}
	@Test
	public void verify_the_header_Msg()
	{
		WebElement headreText = driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]"));
		String expectedResult = "Single Input Field";
		String actualResult = headreText.getText();
		Assert.assertEquals(actualResult, expectedResult);
	}
}
