package locatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03findFacebookusingLocators {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement we = driver.findElement(By.id("email"));
		we.sendKeys("Swagat Ranjan Sahoo");
		
		WebElement we2 = driver.findElement(By.name("pass"));
		we2.sendKeys("Swagat@143");
		
		WebElement we3 = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		we3.click();
		
		
		driver.close();

	}

}
