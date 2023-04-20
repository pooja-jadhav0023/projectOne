package poojajadhav.selenium_framework_design;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.WINDOW); // (WindowType.WINDOW)
		
		Set<String> windowTitles = driver.getWindowHandles();
		Iterator<String> itr = windowTitles.iterator();
		String parentWindow = itr.next();
		String childTab = itr.next();
		
		driver.switchTo().window(childTab);
		driver.get("https://www.gmail.com/");
		driver.switchTo().window(parentWindow);	

	}

}
