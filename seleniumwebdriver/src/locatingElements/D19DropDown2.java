package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class D19DropDown2 {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        driver.get("https://www.rediff.com/");
		
		WebElement we = driver.findElement(By.partialLinkText("Create"));
		we.click();
		
		WebElement we2 = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]"));
		WebElement we3 = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[2]"));
		WebElement we4 = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]"));
		
		Select drop = new Select(we2);
		drop.selectByValue("16");
		
		Select drop1 = new Select(we3);
		drop1.selectByVisibleText("JUL");
		
		Select drop2 = new Select(we4);
		drop2.selectByValue("1997");
		
		

	}

}
