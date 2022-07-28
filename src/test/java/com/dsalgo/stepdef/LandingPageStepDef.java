package com.dsalgo.stepdef;

import org.testng.Assert;

import com.dsalgo.model.LandingPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LandingPageStepDef {
	
	private LandingPage landingpage;

	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
	    
	}

	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
	   landingpage =new LandingPage();
	   landingpage.open();
	   
	}

	@Then("The user should land in DS Algo portal page")
	public void the_user_should_land_in_ds_algo_portal_page() {
	
	    Assert.assertEquals(landingpage.getHeader(), "Preparing for the Interviews");
	}

}
