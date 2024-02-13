package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D23ExplicitWait {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dash.bling-center.com/platform/signIn");
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[5]/button/p")).click();
		driver.findElement(By.id("email1")).sendKeys("Swagat@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/button[2]/p")).click();
		
		WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetsuccess")));
		System.out.println(we.getText());
		

	}

}
