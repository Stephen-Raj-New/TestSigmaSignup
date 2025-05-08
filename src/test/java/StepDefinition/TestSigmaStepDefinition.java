package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjectModule.TestSigmaPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSigmaStepDefinition {
	
  TestSigmaPageObject Test ;
  
 
	public static WebDriver driver;
	
	
	@Given("I am on the Testsigma Login page")
	
	public void i_am_on_the_testsigma_login_page() {
	  
		System.setProperty("webdriver.edge.driver","C:\\Users\\Stephen\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testsigma.com/");
	
		Test = new TestSigmaPageObject(driver);
	}

	@Given("Click on try for free")
	public void click_on_try_for_free() {
	  Test.ClickOnTryForFree();
	}

	@When("I enter my user name and details")
	public void Enter_First_Name() throws InterruptedException {
		Test.Enter_First_Name("Stephen");
		Test.Enter_Last_Name("Raj");
	}

	@When("i entered my Email")
	public void i_entered_my_email() {
	    Test.Enter_Email("Stephen@chitty.com");
	}
     @Then("Select Country Code")
     public void Choose_A_CountryCode() {
    	 Test.Select_CountryCode();
     }
     @Then("Enter the Phone Number")
     public void enter_the_phone_number()throws InterruptedException {
    	
        	 Test.Enter_PhoneNumber("87654321");
         }
    
     @And("Enter The Phone Number")
     public void Enter_Phone_Number() throws InterruptedException
     {
    	 Test.Enter_PhoneNumber("87654321");
     }
      @Then("Select a reason")
	public void select_a_reason() {
	 Test.SelectprimaryReason(); 
	}
	@And("click on checkbox for which application")
	public void click_on_checkbox_for_which_application() {
	    Test.Click_CheckBox();
	}

	@Then("click on submit")
	public void click_on_submit() {
	   Test.Submit();
	}
	@Then("Close the Browser")
	public void close_the_browser() {
	    Test.ClosetheBrowser();
	 
	}

}
