package poojajadhav.selenium_framework_design;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// relative locator can not locate flex element 

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement searchBox = driver.findElement(By.cssSelector("input[name=name]"));
		String name = driver.findElement(with(By.tagName("label")).above(searchBox)).getText();
		System.out.println(name);
	}

}
