package testNgDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class multipleTests {
	WebDriver driver;
  @Test(priority = 3)
  public void openGoogle() 
  {
	  driver.get("https://www.google.co.in/");
	  System.out.println(driver.getTitle());
  }
  @Test(priority = 2)
  public void openFlipkart() 
  {
	  driver.get("https://www.flipkart.com/");
	  System.out.println(driver.getTitle());
  }
  @Test(priority = 1)
  public void openRediff() 
  {
	  driver.get("https://www.rediff.com/");
	  System.out.println(driver.getTitle());
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
