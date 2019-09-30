package step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java8.En;
import io.github.bonigarcia.wdm.WebDriverManager;
import page_objects.PageObjectBase;

public class Hooks implements En {
	public static WebDriver driver;
	
	public Hooks() {		
		BeforeStep(()-> {	
			try {
				PageObjectBase.initiateBrowser();
			} catch (Exception | AssertionError e) {
				System.out.println("An error ocurred in the BeforeStep() function");
			}
		});
	}
}
