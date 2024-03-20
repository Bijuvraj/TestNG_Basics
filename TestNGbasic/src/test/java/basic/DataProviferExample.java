package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviferExample {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
		}
	@Test(dataProvider = "Items" ,dataProviderClass = Data_Provider.class)
	public void SearchButton(String product)
	{
		WebElement searchfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchfield.sendKeys(product);
		searchfield.click();
		System.out.println(product);
	}
	@Test(dataProvider = "Amazonlogin",dataProviderClass = Data_Provider.class)
	public void facebooklogin(String username,String password)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//WebElement searchfield = driver.findElement(By.xpath(" 
		System.out.println(username+" "+password);
	}
}
