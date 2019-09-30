package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectBase {

	public static WebDriver driver;
	
	public static void initiateBrowser() {
		try {
			if (WebDriverManager.chromedriver()==null) {
				WebDriverManager.chromedriver().forceDownload();
			}
			WebDriverManager.chromedriver().setup();
			
			System.setProperty("webdriver.path", System.getProperty("webdriver.chrome.driver"));
			ChromeOptions chromeOptions = new ChromeOptions();
			driver = new ChromeDriver(chromeOptions);	
			driver.manage().window().maximize();
			driver.get("https://todoist.com");
		} catch (Exception | AssertionError e) {
			System.out.println("An error ocurred in the Before() function");
		}
	}
}
