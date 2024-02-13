package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D16UsingRadioBotton {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.navigate().to("https://www.rediff.com/");
		
		WebElement we = driver.findElement(By.partialLinkText("Create"));
		we.click();
		
		//It is for male Radio Button
		
		WebElement we2 = driver.findElement(By.cssSelector("input[value='m']"));
		if(! we2.isSelected())
		we2.click();
		
		//IT is for female Radio Button
		
//		WebElement we3 = driver.findElement(By.cssSelector("input[value='f']"));
//		if(! we3.isSelected())
//		we3.click();
		

	}

}
