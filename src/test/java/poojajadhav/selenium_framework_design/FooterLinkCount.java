package poojajadhav.selenium_framework_design;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footer= driver.findElement(By.className("footer_top_agile_w3ls"));
		int size = footer.findElements(By.tagName("a")).size();
		System.out.println(".size(): "+size);
		List<WebElement> footerLinks =  footer.findElements(By.tagName("a"));
		System.out.println("List: "+footerLinks.size());
		
		String ctrlclick = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		Iterator<WebElement> itr = footerLinks.iterator();
		while(itr.hasNext()) {
			String url = itr.next().getText();
			System.out.println(url +" : "+ itr.next().getAttribute("href"));
			itr.next().sendKeys(ctrlclick);
		}
		
		///added code here 
		// added code here : gitX 
		
		// test one 
		// test two
		
		
		
	}

}
