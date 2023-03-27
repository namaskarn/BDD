package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	
	@Given("^Open the Firefox and lunch the application$")
	public void Open_the_Firefox_and_lunch_the_application() throws Throwable 
	{
		
		System.out.println("This Step open the Firefox and launch the application.");
		
	}
	
	@When("^Enter the Username and Password$")
	public void Enter_the_Username_and_Password() throws Throwable
	{
		
		System.out.println("This step enter the Username and Password on the login page.");
	}

	@Then("^Reset the credential$")
	public void Reset_the_credential() throws Throwable
	{
		System.out.println("This step click on the reset button.");
	}
}
