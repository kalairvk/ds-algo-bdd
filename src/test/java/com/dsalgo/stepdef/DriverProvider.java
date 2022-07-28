package com.dsalgo.stepdef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {

	private static WebDriver driver;
	private static boolean initialized;

	public static WebDriver getDriver() {
		if (!initialized) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			initialized = true;
		}
		return driver;
	}

	public static void quit() {
		driver.quit();
	}
}
