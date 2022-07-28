package com.dsalgo.stepdef;

import org.openqa.selenium.WebDriver;

import com.dsalgo.model.HomePage;
import com.dsalgo.model.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageStepDef {

	private WebDriver driver;

	private RegisterPage registerPage;

	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		HomePage homePage = new HomePage(driver);
		registerPage = homePage.register("Register");
	}

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String buttonName) {
		registerPage.submitRegistration(buttonName);

	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
