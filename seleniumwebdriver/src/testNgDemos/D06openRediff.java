package testNgDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D06openRediff 
{
	WebDriver driver;
	@Test(groups = "leftSides",priority = 1)
	public void openRediffMail()
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a[1]")).click();
	}
	@Test(groups = "leftSides",priority = 2)
	public void openMoney()
	{
		driver.findElement(By.linkText("Money")).click();
	}
	@Test(groups = "rightSides",priority = 3)
	public void openSignIn()
	{
		driver.findElement(By.linkText("Sign in")).click();
	}
	@Test(groups = "rightSides",priority = 4)
	public void openCreateAccount()
	{
		driver.findElement(By.linkText("Create Account")).click();
	}
	@AfterMethod(alwaysRun = true)
	public void afterMethod() 
	{
		driver.navigate().back();
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.rediff.com/");
	}

	@AfterTest(alwaysRun = true)
	public void afterTest()
	{
		driver.close();
	}

}
