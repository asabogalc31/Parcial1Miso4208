package step_definition;

import cucumber.api.java8.En;
import page_objects.SignUp;

public class SignUpSteps implements En {
	SignUp signUp;
	
	public SignUpSteps(){
		Given("^I want to register me with my name \"([^\"]*)\", email \"([^\"]*)\" and password \"([^\"]*)\"$", (String name, String email, String password) -> {
			signUp.createAccount(name, email, password);
		});
	}
}
