package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D15CheckBoxCheckDemoQA {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.navigate().to("https://demoqa.com/checkbox");
		
		WebElement we = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/label/span[1]"));
//		System.out.println("Check box is selected =" + we.isSelected());
//		System.out.println("Check box is enable =" + we.isEnabled());
//		System.out.println("Check box is diplayed =" + we.isDisplayed());
		
		we.click();
		
		WebElement we2 = driver.findElement(By.id("result"));
		System.out.print(we2.getText());
		//System.out.println("Check Box is selected =" + we.isSelected());
		

	}

}
