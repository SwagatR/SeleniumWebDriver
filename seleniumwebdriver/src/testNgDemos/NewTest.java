package testNgDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void LoginToEchotrack() 
  {
	  driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	  driver.findElement(By.id("txtCustomerID")).sendKeys("Swagat@1607");
	  driver.findElement(By.id("txtPassword")).sendKeys("swagat123");
	  driver.findElement(By.id("Butsub")).click();
	  WebElement we = driver.findElement(By.id("lblMsg"));
	  System.out.println("Print the invalid Message = " +we.getText());
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("This is a Before Method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Print The Title Of EchoTrack = " + driver.getTitle());
  }

  @BeforeTest
  public void beforeTest()
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
  }

  @AfterTest
  public void afterTest()
  {
	 driver.close(); 
  }

}
