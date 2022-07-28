package com.dsalgo.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dsalgo.stepdef.DriverProvider;

public class LandingPage {
	
	private WebDriver driver;
	private By headertextBy= By.xpath("//h1");
	
	public LandingPage() {
		this.driver=DriverProvider.getDriver();
		
	}
	
	public void open(){
		driver.get("https://dsportalapp.herokuapp.com/");
	}
	
	public String getHeader() {
		
		return driver.findElement(headertextBy).getText();
	}

	

	public HomePage click(String button) {
		driver.findElement(By.xpath("//button[contains(text(),'"+button+"')]")).click();
		return new HomePage(driver);
	}

	public HomePage goHome() {
		return click("Get Started");
	}

	
}
