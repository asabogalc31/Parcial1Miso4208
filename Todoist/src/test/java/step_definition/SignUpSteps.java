package step_definition;

import cucumber.api.java8.En;

public class SignUpSteps implements En {
	public SignUpSteps(){
		Given("^I want to register me with email \"([^\"]*)\" and password \"([^\"]*)\"$", (String email, String password) -> {
			System.out.println(email + password);
		});
	}
}
