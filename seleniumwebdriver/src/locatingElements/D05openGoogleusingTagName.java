package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05openGoogleusingTagName {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//  driver.get("https://www.google.co.in/");
			driver.navigate().to("https://www.facebook.com/");
		
//		WebElement we = driver.findElement(By.tagName("a"));
//		we.click();
//		System.out.println(we.getText());
		
//		String title = driver.getTitle();
//		System.out.println(title);
		
		WebElement we = driver.findElement(By.tagName("input"));
		we.sendKeys("SwagatRanjanSahoo");
		
		WebElement we2 = driver.findElement(By.id("pass"));
		we2.sendKeys("Swagat@123");
		
		driver.close();
		

	}

}
