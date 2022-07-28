package com.dsalgo.stepdef;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import com.dsalgo.model.HomePage;
import com.dsalgo.model.LandingPage;
import com.dsalgo.model.RegisterPage;
import com.dsalgo.model.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	private HomePage homePage;
	private SignInPage signInPage;
	private RegisterPage registerPage;

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String button) {
		LandingPage landingPage = new LandingPage();
		landingPage.open();
		homePage = landingPage.click(button);
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {

		assertNotNull(homePage.getHeader(), "The home page header is missing!");

	}

	@Then("The user should see {int} panes with different data structures")
	public void the_user_should_see_panes_with_different_data_structures(Integer expectedPanes) {

		assertEquals(homePage.getPaneListSize(), expectedPanes);
	}

	@Given("The user opens HomePage")
	public void the_user_opens_home_page() {
		LandingPage landingPage = new LandingPage();
		landingPage.open();
		homePage = landingPage.goHome();
	}

	@When("The user clicks {string} drop down")
	public void the_user_clicks_drop_down(String dropdown) {
		homePage.clickDropDown(dropdown);

	}

	@Then("I should see {int} different data structure entries in that dropdown")
	public void i_shouls_see_different_data_structure_entries_in_that_dropdown(Integer dropdownList) {
		assertEquals(homePage.getDropdownList(), dropdownList);
	}

	@When("The user clicks any of the {string} buttons below the data structures")
	public void the_user_clicks_any_of_the_buttons_below_the_data_structures(String string) {
		homePage.clickDatastructuresButton();
	}

	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String alertMsg) {
		assertEquals(homePage.getAlertMsg(), alertMsg);
	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String linkButton) {
		if("Sign in".equals(linkButton)) {
			signInPage = homePage.clickSignIn(linkButton);
		}else if("Register".equals(linkButton)) {
			registerPage = homePage.register(linkButton);
		}
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		assertNotNull(signInPage.getLoginButton());

	}
	

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		assertNotNull(registerPage.getRegisterButton());
	}

}
