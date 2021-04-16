package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logg {


@Given("User is in facebook login page")
public void user_is_in_facebook_login_page() {
   System.out.println("step 1");
}

@When("User enter invalid {string} and {string}")
public void user_enter_invalid_and(String string, String string2) {
	 System.out.println("step 2");
}

@When("User click login button")
public void user_click_login_button() {
	 System.out.println("step 3");
}

@Then("User should be in invalid credential page")
public void user_should_be_in_invalid_credential_page() {

	 System.out.println("step 4");
}


}
