package com.dsalgo.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	private WebDriver driver;
	private By registerbuttonBy = By.xpath("//input[@value='Register']");

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getRegisterButton() {
		return driver.findElement(registerbuttonBy);
	}
	
	public void submitRegistration(String buttonName) {
		driver.findElement(By.xpath("//input[@value='"+buttonName+"']")).click();
	}

}
