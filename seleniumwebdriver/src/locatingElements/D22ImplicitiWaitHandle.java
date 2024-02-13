package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D22ImplicitiWaitHandle {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile", Keys.ENTER);
		
		driver.findElement(By.linkText("Smartphones")).click();
		
		WebElement we =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[4]/ul/span/span[1]/li/span/a/div/label/i"));
		we.click();
		
		System.out.println(driver.getTitle());
		

	}

}
