package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D26CalenderPractices {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.navigate().to("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		//First Date
		WebElement we = driver.findElement(By.id("first_date_picker"));
		we.click();
		
		WebElement clpButton = driver.findElement(By.xpath("/html/body/div[3]/div/a[1]/span"));
		clpButton.click();
		
		WebElement cld = driver.findElement(By.linkText("1"));
		cld.click();
		
		//Second Date
		WebElement we2 = driver.findElement(By.id("second_date_picker"));
		we2.click();
		
		WebElement clpButton2 = driver.findElement(By.xpath("/html/body/div[3]/div/a[1]/span"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",clpButton2);
		
		WebElement cld2 = driver.findElement(By.linkText("15"));
		cld2.click();
		
		//Third Date
		WebElement we3 = driver.findElement(By.id("third_date_picker"));
		we3.click();
		
		WebElement clMonthButton3 = driver.findElement(By.xpath("/html/body/div[3]/div/div/select[1]"));
		Select drp = new Select(clMonthButton3);
		drp.selectByValue("3");
		
		WebElement clpYearButton3 = driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]"));
	    Select drp1 = new Select(clpYearButton3);
		drp1.selectByVisibleText("2020");
		
		WebElement clickDate3 = driver.findElement(By.linkText("29"));
		clickDate3.click();
		
		//Fourth Date
		
		WebElement we4 = driver.findElement(By.id("fourth_date_picker"));
		we4.click();
		
		WebElement clickDate4 = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[6]/td[3]/a"));
		clickDate4.click();
		
		//Sixth Date
		
		WebElement we6 = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/article/div/table/tbody/tr[6]/td[2]/img"));
		we6.click();
		
		WebElement clckMonth6 = driver.findElement(By.xpath("/html/body/div[3]/div/a[1]/span"));
	
		Thread.sleep(1000);
		  clckMonth6.click();
		Thread.sleep(1000);
		  clckMonth6.click();
		Thread.sleep(1000);
		  clckMonth6.click();
		
		WebElement clickDate6 = driver.findElement(By.linkText("15"));
		clickDate6.click();
		
		
		
		
		

	}

}
