package com.test.stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	
	 WebDriver driver;

	
	@Given("^user launches browser and navigate to www\\.amazon\\.com$")
	public void user_launches_browser_and_navigate_to_www_amazon_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String driverPath = "C:\\Users\\slyam\\Desktop\\Driver File\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		String url = "http://www.amazon.com";
		System.out.println("Inside lauch browser");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div/a[1]/span[1]")).isDisplayed());
	  
	}

	@When("^user clicks on your amazon\\.com link$")
	public void user_clicks_on_your_amazon_com_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside your amazon.com link");
	    driver.findElement(By.id("nav-your-amazon")).click();
	    Thread.sleep(3000);
	}

	@Then("^user should be navigated to login page$")
	public void user_should_be_navigated_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside login page");
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/form/div/div/div/h1")).isDisplayed());	  
	}
	@Then("^user should see email,pw,edit box and login button$")
	public void user_should_see_email_pw_edit_box_and_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside login button");
		Assert.assertTrue(driver.findElement(By.id("ap_email")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("ap_password")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("signInSubmit")).isDisplayed());			
	}
	@When("^enters valid username \"([^\"]*)\" and paw \"([^\"]*)\" and click on sign on$")
	public void userCredentials (String username, String pw) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ap_email")).sendKeys(username);
		driver.findElement(By.id("ap_password")).sendKeys(pw);
		driver.findElement(By.id("signInSubmit")).click();
	    
	}

	@Then("^verify user is logged in successfully$")
	public void verify_user_is_logged_in_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue(driver.findElement(By.id("auth-warning-message-box")).isDisplayed());
	}
	@When("^enters valid username and pw  and click on sign on$")
	public void enters_valid_username_and_pw_and_click_on_sign_on(DataTable dtvalues) throws Throwable {
		
		List <Map <String, String >> dmvalues = dtvalues.asMaps(String.class, String.class);		
		for (int i = 0; i > dmvalues.size(); i++){
			
			System.out.println(dmvalues.get(i).get("username"));	
			driver.findElement(By.id("ap_email")).sendKeys(dmvalues.get(i).get("username"));
			driver.findElement(By.id("ap_password")).sendKeys(dmvalues.get(i).get("Password "));
			driver.findElement(By.id("signInSubmit")).click();
			
		}
	   
	}

	@Then("^user closes the application$")
	public void user_closes_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	   driver.close();
	   driver.quit();
	}
}
