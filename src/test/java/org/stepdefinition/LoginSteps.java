package org.stepdefinition;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginSteps extends LibGlobal {
	public WebDriver driver;
	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		   

	}

	@When("User enter invalid {string} and {string}")
	public void user_enter_invalid_and(String string, String string2) {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(string);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(string2);
		
		
	}

	@When("User click login button")
	public void user_click_login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

	@Then("User should be in invalid credential page")
	public void user_should_be_in_invalid_credential_page() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("privacy-mutation-token_"));
	}
	@When("User enter invalid username and password")
	public void user_enter_invalid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new cucumber.api.PendingException();
	}

	@When("User click login button without entering any credentials")
	public void user_click_login_button_without_entering_any_credentials() {
	   
	    
	}

	@Then("User should be in invalid credentials page")
	public void user_should_be_in_invalid_credentials_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	@Before("@Sanity")
	private void beforeSantity() {
	System.out.println("Santiy sceranio stars");

	}
	@After("@Sanity")
	private void afterSanity() {
	System.out.println("Santiy sceranio stars");

	}




}
