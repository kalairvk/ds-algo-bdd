package com.dsalgo.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	
	private WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//input[@value='Login']"));
	}


}
