package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleShow {
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/simple-form-demo.php");
			driver.manage().window().maximize();
		}
	@Test
	public void verifyButtonText()
	{
		WebElement showMgsButton = driver.findElement(By.xpath("//button[text()='Show Message']"));
		String showMsgBtn= showMgsButton.getText();
		System.out.println(showMsgBtn);
		
		WebElement getTotalButton = driver.findElement(By.xpath("//button[text()='Get Total']"));
		String getTotal = getTotalButton.getText();
		System.out.println(getTotal);
		softAssert.assertEquals(showMsgBtn, "Show Message"); //only one Assert in one test 
		softAssert.assertEquals(getTotal, "Get Total");    //one or two 
		softAssert.assertAll(); //throw an exception
		System.out.println("After Assert");
	}
}
