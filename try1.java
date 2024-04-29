package Testtry;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class try1 {
    static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Launch the URL
		driver.get("file:///C:/Users/Administrator/Desktop/alert.html");
		
		
		//Click the link to activate the alert
		driver.findElement(By.linkText("Show confirm box")).click();

		
		
		//Wait for the alert to be displayed
		//if(Wait.until(ExpectedConditions.alertIsPresent())==null)
		{
			System.out.println("alert was not present");
		}
		//else(System.out.println("alert was present"));

		//Store the alert in a variable
		Alert alert = driver.switchTo().alert();

		//Store the alert in a variable for reuse
		String text = alert.getText();

		//Press the Cancel button
		alert.dismiss();		}
		
		
	
		}


