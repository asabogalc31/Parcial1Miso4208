package step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java8.En;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks implements En {
	public static WebDriver driver;
	
	public Hooks() {
		Before(0,(Scenario scenario)->{
			if (WebDriverManager.chromedriver()==null) {
				WebDriverManager.chromedriver().forceDownload();
			}
			WebDriverManager.chromedriver().setup();
		});
		
		BeforeStep(()-> {			
			System.setProperty("webdriver.path", System.getProperty("webdriver.chrome.driver"));
			ChromeOptions chromeOptions = new ChromeOptions();
			driver = new ChromeDriver(chromeOptions);	
			driver.manage().window().maximize();
			driver.get("https://todoist.com");
		});
	}
}