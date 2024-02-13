package locatingElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D27HandlingTable {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.navigate().to("https://www.rediff.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[8]/div[1]/div[3]/div[1]/p/a")).click();
		
		List<WebElement>we = driver.findElements(By.xpath("/html/body/div[2]/div[5]/table/thead/tr/th"));
		for(WebElement wl : we)
			System.out.println(wl.getText());
		

		List<WebElement>we2 = driver.findElements(By.xpath("/html/body/div[2]/div[5]/table/tbody/tr/td[1]/a"));

		int count=0;
		for(WebElement wl2 : we2)
		{
			count++;
			System.out.println(wl2.getText()+" "+ count);
			//System.out.println(count);
		}
			
		
	}

}
