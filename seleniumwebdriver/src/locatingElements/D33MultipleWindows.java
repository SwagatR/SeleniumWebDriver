package locatingElements;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D33MultipleWindows {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
		driver.navigate().to("https://online.citibank.co.in/");
		
		driver.findElement(By.className("newclose")).click();
		driver.findElement(By.className("newclose2")).click();
		
		WebElement we = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img"));
		we.click();
		
		System.out.println(driver.getTitle());
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		
		String homepage = itr.next();
		String loginpage = itr.next();
		
		driver.switchTo().window(loginpage);
		driver.findElement(By.id("User_Id")).sendKeys("Swagat");
	    System.out.println(driver.getTitle());
	    
	    driver.switchTo().window(homepage);
	    driver.findElement(By.linkText("Banking")).click();
	    System.out.println(driver.getTitle());
	    
	    driver.quit();
		

	}

}
