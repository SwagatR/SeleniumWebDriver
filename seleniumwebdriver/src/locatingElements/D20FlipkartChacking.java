package locatingElements;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D20FlipkartChacking {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.navigate().to("https://www.flipkart.com/");
		
		WebElement we = driver.findElement(By.xpath("/html/body/div[3]/div/span"));
		we.click();
		
		WebElement we2 = driver.findElement(By.className("Pke_EE"));
		we2.sendKeys("Mobiles",Keys.ENTER);
		
		WebElement we3 =  driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select"));
		
		Select drp = new Select(we3);
		drp.selectByValue("15000");
		
		WebElement we4 = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select"));
		
		drp = new Select(we4);
		drp.selectByVisibleText("₹30000");
		
		System.out.println(driver.getCurrentUrl());
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement we5 = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]"));
		we5.click();
		
		driver.findElement(By.linkText("SAMSUNG Galaxy F34 5G (Orchid Violet, 128 GB)")).click();
        System.out.println(driver.getTitle());
		
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> itr = windows.iterator();
        
        String mobilepage = itr.next();
        String samsungpage = itr.next();
        
        driver.switchTo().window(samsungpage);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]")).click();
        
        System.out.println(driver.getTitle());
        
        driver.switchTo().window(mobilepage);
        System.out.println(driver.getTitle());
		
	}

}
