package testNgDemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class D07rediffClass
{
	WebDriver driver;

	public D07rediffClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void openRediff(String url)
	{
		driver.get(url);
	}

	public void clickSignin()
	{
		driver.findElement(By.className("signin")).click();
	}
	public void setUserName(String usernm)
	{
		driver.findElement(By.id("login1")).sendKeys(usernm);
	}
	
	public void clickonLogin()
	{
		driver.findElement(By.className("signinbtn")).click();
	}
	public void handleAlert()
	{
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}
	
}

