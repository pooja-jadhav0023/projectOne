package poojajadhav.selenium_framework_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor jse =  (JavascriptExecutor)driver; 
		// scroll to the table 
		jse.executeScript("window.scroll(0,500)");
		//scroll to bottom within the table 
		jse.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

		// get total in the table 
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for(int i =0; i< values.size();i++) {
		System.out.println(Integer.parseInt(values.get(i).getText())); // Integer.parseInt to convert string ("28") to integer (28)
		sum = sum + Integer.parseInt(values.get(i).getText());	
		}
		System.out.println("Addition is : "+ sum);
		// compare result 
		
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println("Sum on page is : "+ total);
		Assert.assertEquals(sum, total);
	}

}
