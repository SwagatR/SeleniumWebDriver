package testNgDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D08rediffClint {
	WebDriver driver;
	D07rediffClass r1;
  @Test
  public void rediffPage()
  {
	  r1.openRediff("https://www.rediff.com/");
	  r1.clickSignin();
	  r1.setUserName("Swagat");
	  r1.clickonLogin();
	  r1.handleAlert();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  r1 = new D07rediffClass(driver);
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
