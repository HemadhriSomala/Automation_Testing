package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Update_info {
	
public WebDriver ldriver;
	
	public Update_info(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()='Update Contact Info']")
	WebElement updateinfo;
	
	@FindBy(xpath="//input[@name='customer.firstName']")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@name='customer.lastName']")
	WebElement Lastname;
	
	@FindBy(xpath="//input[@name='customer.address.street']")
	WebElement Address;
	
	@FindBy(xpath="//input[@name='customer.address.city']")
	WebElement City;
	
	@FindBy(xpath="//input[@name='customer.address.state']")
	WebElement State;
	
	@FindBy(xpath="//input[@name='customer.address.zipCode']")
	WebElement Zipcode;
	
	@FindBy(xpath="//input[@name='customer.phoneNumber']")
	WebElement Phoneno;
	
	@FindBy(xpath="//input[@value='Update Profile']")
	WebElement updatePro;
	
	public void updateInfo()
	{
		updateinfo.click();
	}
	
	public void phoneno_update(String string)
	{
		Phoneno.clear();
		Phoneno.sendKeys(string);
	}
	
	public void Click_updatepro()
	{
		
		updatePro.click();
	}
	
	

}
