package com.fannie.selenium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions {
	
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;

	public static String baseURL = "http://sdettraining.com/trguitransactions/default.aspx?id=new";

	public void createDriver() throws MalformedURLException,
			InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\071717\\ALLJARS\\geckodriver.exe");
		driver = new FirefoxDriver();

		//driver.manage().window().maximize(); comment out due to firefox error where browser gives width error
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(baseURL);

		//Provides the ability to wait for an arbitrary condition during test execution. 
		//ExpectedConditions Command
        //Purpose: Models a condition that might reasonably be expected to eventually evaluate to something that is neither null nor false.
		waitVar = new WebDriverWait(driver, 15);
	}

	public void ishomepageDisplayed() {
		//waitVar.until(ExpectedConditions.presenceOfElementLocated(By
		//		.id("HeadLoginView_lblLoginStatus")));

		driver.findElement(By.linkText("HeadLoginView_lblLoginStatus")).isDisplayed();
		driver.findElement(By.className("btn btm-sm btn-primary")).isDisplayed();
	}

	public void clickSigninLink() {
		driver.findElement(By.xpath(".//*[@id='HeadLoginView_HeadLoginStatus']")).click();
		System.out.println("Login LINK CLICKED");
	}

	//public void isloginsectionDisplayed() {
	//	waitVar.until(ExpectedConditions.presenceOfElementLocated(By.className("auth-form-body")));
	//	waitVar.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
	//}
	
	public void teardown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}