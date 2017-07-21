package com.fannie.step_definitions;



import org.openqa.selenium.By;

import com.fannie.selenium.SeleniumFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Step_Definition {

	SeleniumFunctions sf = new SeleniumFunctions();
	
	
	@Given("^user is on sdettraining homepage$")
	public void user_is_on_sdettraining_homepage() throws Throwable {
		sf.createDriver();
		System.out.println("Homepage is displayed");
		sf.clickSigninLink();
		
		
		
	}

	@When("^user clicks on Signin link$")
	public void a_user_click_on_Signin_link() throws Throwable {
	
		System.out.println("Homepage is displayed");
	}

	@When("^user enters \"([^\"]*)\" as username or email address$")
	public void user_enters_username_or_email_address(String username) throws Throwable {
		System.out.println("Homepage is displayed");
		
		
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_password(String password) throws Throwable {
		
		System.out.println("Homepage is displayed");
	}

	@When("^user click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
		System.out.println("Homepage is displayed");
	}
	

	@Then("^user should see Welcome back message$")
	public void user_should_see_welcome_back_message() throws Throwable{
		System.out.println("Homepage is displayed");
		
	}


}
