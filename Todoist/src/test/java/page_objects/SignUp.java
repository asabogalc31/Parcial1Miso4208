package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUp extends PageObjectBase {
	/*
	 * Static variables
	 */
	@FindBy(how = How.XPATH, using = "//*[@id=\"top_menu\"]/li[7]/b/a")
	private WebElement lblSignUp;

	@FindBy(how = How.ID, using = "full_name")
	private WebElement txtFullName;

	@FindBy(how = How.ID, using = "email")
	private WebElement txtEmail;
	
	@FindBy(how = How.ID, using = "password")
	private WebElement txtPassword;
	
	/**
	 * Constructs a new instance
	 */
	public SignUp() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Creates an account
	 */
	public void createAccount(String name, String email, String password) {
		try {
			// Select label sign up
			lblSignUp.click();

			// Enter full name
			txtFullName.sendKeys(name);

			// Enter full name
			txtEmail.sendKeys(email);

			// Enter full name
			txtPassword.sendKeys(password);			
		} catch (Exception | AssertionError e) {
			System.out.println("An error has ocurred in the createAccount() function");
		}
	}
}
