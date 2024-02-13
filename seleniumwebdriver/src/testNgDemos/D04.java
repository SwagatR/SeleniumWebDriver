package testNgDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D04 
{
	WebDriver driver;
  @Test(dataProvider = "signin")
  public void openEchotrack(String us, String ps) 
  {
	  driver.findElement(By.id("txtCustomerID")).sendKeys(us);
	  driver.findElement(By.id("txtPassword")).sendKeys(ps);
	  driver.findElement(By.id("Butsub")).click();
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  driver.findElement(By.id("txtCustomerID")).clear();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  String exp_msg = "Invalid Username/Password",act_msg;
	  WebElement we = driver.findElement(By.id("lblMsg"));
	  act_msg = we.getText();
	  if(exp_msg.equals(we))
		  System.out.println("Test Case Passed");
	  else
		  System.out.println("Test Case Failed");
  }


  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "Swagat", "Swagat@123" },
      new Object[] { "Bunty", "bunty231" },
      new Object[] { "Butki", "butki@123"},
    };
  }
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
