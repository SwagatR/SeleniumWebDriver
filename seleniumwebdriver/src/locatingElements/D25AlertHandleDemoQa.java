package locatingElements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Argument;

public class D25AlertHandleDemoQa {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.navigate().to("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
	    WebElement we =	driver.findElement(By.id("timerAlertButton"));
	    we.click();
	    Thread.sleep(5000);
	    Alert al1 = driver.switchTo().alert();
	    System.out.println(al1.getText());
	    al1.accept();
	    
	    WebElement we2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/button"));
	    we2.click();
	    Alert al2 = driver.switchTo().alert();
	    System.out.println(al2.getText());
	    al2.dismiss();
	    WebElement wmsg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/span[2]"));
	    System.out.println(wmsg.getText());
		
	   WebElement we3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/button"));
	   
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click()",we3);
	   
	    Alert al3 = driver.switchTo().alert();
	    System.out.println(al3.getText());
	    al3.sendKeys("Swagat");
        al3.accept();
        
        WebElement wmsg1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[1]/span[2]"));
        System.out.println(wmsg1.getText());
		

	}

}
