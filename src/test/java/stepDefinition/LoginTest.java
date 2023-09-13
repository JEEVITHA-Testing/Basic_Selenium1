package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
WebDriver driver;

@Given("I Want to Launch the browser")
public void i_want_to_launch_the_browser() {
	WebDriverManager.firefoxdriver().setup();
	driver= new FirefoxDriver(); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Given("enter the URL")
public void enter_the_url() {

	driver.get("http://localhost:8888");
}
	
@When("the login page is displayed enter credentials")
public void the_login_page_is_displayed_enter_credentials() {
	driver.findElement(By.name("user_name")).sendKeys("admin"); 
	driver.findElement(By.name("user_password")).sendKeys("admin");
}
@When("click on login button")
public void click_on_login_button() {
    driver.findElement(By.id("submitButton")).click();
}
@Then("validate for Home page")
public void validate_for_home_page() {
   System.out.println("Home Page Verified");
}
}
