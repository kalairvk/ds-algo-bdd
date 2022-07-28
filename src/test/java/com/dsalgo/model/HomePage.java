package com.dsalgo.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;
	private String getStartedButton ="/../a[text()='Get Started']";

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getHeader() {

		String ele = driver.findElement(By.xpath("//a[text()='NumpyNinja']")).getText();
		return ele;
	}

	public int getPaneListSize() {

		List<WebElement> panelList = driver.findElements(By.className("card-title"));
		return panelList.size();

	}

	public void clickDropDown(String dropdown) {
		driver.findElement(By.xpath("//a[text()='"+dropdown+"']")).click();

	}

	public int getDropdownList() {

		List<WebElement> dropdownList = driver.findElements(By.xpath("//a[@class='dropdown-item']"));
		return dropdownList.size();

	}
	
	public void clickDatastructuresButton() {
		driver.findElement(By.xpath("//h5[contains(text(),'Data Structures')]"+getStartedButton)).click();
		
	}
	
	public String getAlertMsg() {
		return driver.findElement(By.xpath("//div[contains(text(),'You are not')]")).getText();
	}
	
	public SignInPage clickSignIn(String linkButton) {
		driver.findElement(By.xpath("//a[text()='"+linkButton+"']")).click();
		return new SignInPage(driver);
	}

	public RegisterPage register(String linkButton) {
		driver.findElement(By.xpath("//a[contains(text(),'"+linkButton+"')]")).click();
		return new RegisterPage(driver);
	}
	
	
	
	
}
