package md.automation.steps_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    @Given("The user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("The user is on login page");

    }
    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("Entered username and password");

    }
    @When("submit")
    public void submit() {
        System.out.println("Clicked on Submit");

    }
    @Then("The user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("I am logged in");

    }

}
