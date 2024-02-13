package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D17DemoQAradioButton {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.navigate().to("https://demoqa.com/radio-button");
		
		WebElement we = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
		if(! we.isSelected())
			we.click();
		WebElement we2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p"));
		System.out.println(we2.getText());
		
		WebElement we3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]"));
		if(! we3.isSelected())
			we3.click();
		
		WebElement we4 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p"));
		System.out.println(we4.getText());
		
		WebElement we5 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]"));
		System.out.println(we5.isEnabled());
		
		
		
		
		

	}

}
