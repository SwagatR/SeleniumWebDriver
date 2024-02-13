package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07findingEchoTrack {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement we = driver.findElement(By.id("txtCustomerID"));
		we.sendKeys("SwagatRanjan");
		
		WebElement we2 = driver.findElement(By.name("txtPassword"));
		we2.sendKeys("Swagat@143");
		
		WebElement we3 = driver.findElement(By.id("Butsub"));
		we3.click();
		
		WebElement we4 =driver.findElement(By.id("lblMsg"));
		System.out.println(we4.getText());

	}

}
