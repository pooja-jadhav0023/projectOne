package poojajadhav.selenium_framework_design;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.Proxy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTTPSCertification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		// To add chrome extension 
		options.addExtensions(new File("C:\\Users\\pooja\\Downloads\\UIAutomation\\UIAutomation"));
		
		// set proxy 
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:port");
		options.setCapability("proxy", proxy);
		
		// block popup window 
		options.setExperimentalOption("excludeSwitches",
			     Arrays.asList("disable-popup-blocking"));
		
		//set default directory for automation script
		
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		options.setExperimentalOption("prefs", prefs);
		
//		FirefoxOptions options1 = new FirefoxOptions();
//		options1.setAcceptInsecureCerts(true);
//		WebDriver driver1 = new FirefoxDriver(options1);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get(""); //website which says : your connection is not private -> Advanced -> proceed to <Website>
		

	}

}
