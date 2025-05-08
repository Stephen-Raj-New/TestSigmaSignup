package PageObjectModule;
import java.sql.Driver;
import Utilities.Common_Method;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import StepDefinition.TestSigmaStepDefinition;

public class TestSigmaPageObject extends TestSigmaStepDefinition{
  WebDriver driver;
  
@FindBy(xpath= "(//button[@type='button'])[1]") 
WebElement TryForFree_Locator;

@FindBy(xpath= "//input[@name='firstname']")
WebElement FirstName_Locator;

@FindBy(xpath= "//input[@autocomplete='family-name']")
WebElement LastName_Locator;

@FindBy(xpath = "//input[@inputmode='email']")
WebElement Email_Locator;

@FindBy(xpath = "//select[@id='phone_ext-7ba37f75-fdb5-4496-80d9-bf93a3fc4470']")
WebElement SelectCountry_Locator;

@FindBy(xpath = "//select[@id='phone_ext-7ba37f75-fdb5-4496-80d9-bf93a3fc4470']")
WebElement PhoneNumber_Locator;

@FindBy(xpath = " //select[@id='what_brought_you_here_-7ba37f75-fdb5-4496-80d9-bf93a3fc4470']")
WebElement PrimaryReason_Locator;

@FindBy(xpath = "//input[@id='application_types__c0-7ba37f75-fdb5-4496-80d9-bf93a3fc4470']")
WebElement ApplicationCheckBox_Locator;

@FindBy(xpath = "//input[@type='submit']")
WebElement Submit_Locator;

public TestSigmaPageObject(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
	 public void ClickOnTryForFree() {
	   TryForFree_Locator.click();
	 }
	 
	public void Enter_First_Name(String username) throws InterruptedException 
	{
		Thread.sleep(5000);
		//Thread.sleep(1000);
		FirstName_Locator.sendKeys(username);
		
	}
	public void Enter_Last_Name(String passcode) {
		LastName_Locator.sendKeys(passcode);
	}
	public void Enter_Email(String email) {
		Email_Locator.sendKeys(email);
	}
	
	public void Select_CountryCode() {
		Select choose = new Select(SelectCountry_Locator);
		choose.selectByVisibleText("Ireland");
	}
	public void Enter_PhoneNumber(String phonenumber)throws InterruptedException {
		Thread.sleep(3000);
		
		PhoneNumber_Locator.sendKeys(String.valueOf(phonenumber));
	}
	public void SelectprimaryReason() {
		Select select = new Select(PrimaryReason_Locator);
		select.selectByVisibleText("I just want to learn and get certified");
	}
	public void Click_CheckBox() {
		ApplicationCheckBox_Locator.click();
	}
	public void Submit() {
	
		Submit_Locator.click();
	}
		public void ClosetheBrowser()
		{
		 driver.close();
	}
	
} 
