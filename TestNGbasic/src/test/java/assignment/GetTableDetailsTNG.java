package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTableDetailsTNG {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/table-pagination.php");
			driver.manage().window().maximize();
		}
	@Test
	public void verifyTheSalaryOfBrielle_Williamson()
	{
		WebElement salaryOfBrielleWilliamson = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody/tr[6]/td[6]"));
		System.out.println(salaryOfBrielleWilliamson.getText());
	}
	@Test
	public void verifyThePositionOfColleen_Hurst()
	{
		WebElement positionOfColleenHurst = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody/tr[9]/td[2]"));
		System.out.println(positionOfColleenHurst.getText());
	}
}
