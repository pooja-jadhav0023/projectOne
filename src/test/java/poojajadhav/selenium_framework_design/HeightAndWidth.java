package poojajadhav.selenium_framework_design;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeightAndWidth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.cssSelector("textarea[title=Search]"));
		int height = searchBox.getRect().getDimension().getHeight();
		System.out.println("height is : "+height);
		
		int width = searchBox.getRect().getDimension().getWidth();
		System.out.println("height is : "+width);
		
		// develop
		//develop git x
	}

}
