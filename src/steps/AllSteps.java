package steps;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AllSteps {
	
	public static WebDriver driver;
	
	
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Given("when user in homepage")
	public void when_user_in_Homepage() {
		setup();
		driver.get("https://www.amfam.com/");
		System.out.println("Homepage");
	}
	
	@Given("üser click on auto button")
	public void user_click_auto_button() {
		driver.findElement(By.xpath("(//button[@class='LeadRouting__select a'])[1]")).click();
		System.out.println("Click button");
	}
	
	@When("user input {string} zipcode")
	public void input_zipcode(String string) {
		driver.findElement(By.id("uid_54")).sendKeys(string);
		System.out.println("ïnput zip: " + string);
	}
	

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	@When("user input {string} in zipcode")
	public void user_input_in_zipcode(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("When");
	}
	@And("another action")
	public void another_action() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Änd");
	}
	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
	}


	@Given("homepage")
	public void homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given");
	}
	@Given("click button")
	public void click_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("A");
	}

*/





}
