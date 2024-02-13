package testNgDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05openGoogle
{
	WebDriver driver;
  @Test(priority = 1)
  public void opengmail() 
  {
	  driver.findElement(By.linkText("Gmail")).click();
  }
  @Test(priority = 2)
  public void openImages() 
  {
	  driver.findElement(By.linkText("Images")).click();
  }
  @Test(priority = 3)
  public void openAbout() 
  {
	  driver.findElement(By.linkText("About")).click();;
  }
  @Test(priority = 4)
  public void openAdvertising() 
  {
	  driver.findElement(By.linkText("Advertising")).click();
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("This is a Before Method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println(driver.getTitle());
	  driver.navigate().back();
  }

  @BeforeTest
  public void beforeTest() 
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  driver.get("https://www.google.co.in/");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
