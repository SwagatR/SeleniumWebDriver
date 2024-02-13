package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D18UsingDropDowns {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.rediff.com/");
		
		WebElement we = driver.findElement(By.partialLinkText("Create"));
		we.click();
		
		WebElement we2 = driver.findElement(By.id("country"));
		Select drp = new Select(we2);
		//System.out.println(drp.getOptions().size());
		//System.out.println(drp.getFirstSelectedOption().getText());
		drp.selectByVisibleText("Christmas Island");
		drp.selectByValue("65");
		

	}

}
