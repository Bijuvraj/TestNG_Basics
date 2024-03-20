package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipSwitchWindow {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/window-popup.php");
			driver.manage().window().maximize();
		}
	@Test
	public void verifyToolTip_LikeUSOnFacebook_Button() throws Throwable
	{
		WebElement likeUsOnFacebookButton = driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(likeUsOnFacebookButton).build().perform();
		System.out.println(likeUsOnFacebookButton.getAttribute("Title"));
		String expectedResult ="Follow @obsqurazone on Facebook";
		String actualResult = likeUsOnFacebookButton.getAttribute("Title");
		Assert.assertEquals(actualResult, expectedResult);
	}
	@Test
	public void clickFollowButto()
	{
		WebElement clickLikeUsOnFacebookButton = driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook')]"));
		clickLikeUsOnFacebookButton.click();
		String parentwindow = driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while(itr.hasNext())
		{
			String childwindow = itr.next();
			if (!parentwindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
			}
		}
		System.out.println(driver.getTitle());
		WebElement newWindow = driver.findElement(By.xpath("(//span[text()='See more on Facebook'])[1]"));
		System.out.println(newWindow.getText());
		driver.close();
	}
}
