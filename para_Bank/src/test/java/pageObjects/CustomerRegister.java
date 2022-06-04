package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CustomerRegister {
	
	public WebDriver ldriver;
	
	public CustomerRegister(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
		
	}
	
	By Register_Customer=By.xpath("//a[text()='Register']");
	By First_Name=By.id("customer.firstName");
	By Last_Name=By.id("customer.lastName");
	By Address=By.id("customer.address.street");
	By City=By.id("customer.address.city");
	By State=By.id("customer.address.state");
	By zipcode=By.name("customer.address.zipCode");
	By PhoneNo=By.name("customer.phoneNumber");
	By ssn=By.id("customer.ssn");
	
	By username=By.id("customer.username");
	By password=By.id("customer.password");
	By confirmpwd=By.id("repeatedPassword");
	
	By R2gister=By.xpath("//input[@value='Register']");

	
	//Actions Methods
	
	public String getPageTitle() {
		return ldriver.getTitle();
	}
	public void ClickonRegister() {
		ldriver.findElement(Register_Customer).click();
	}
	
	public void Firstname(String Fname) {
		
		ldriver.findElement(First_Name).sendKeys(Fname);
		
	}
	
	public void Lastname(String Lname) {
		ldriver.findElement(Last_Name).sendKeys(Lname);
		
	}
	public void address(String address) {
		ldriver.findElement(Address).sendKeys(address);
	}
	
	
	public void city(String ct) {
		ldriver.findElement(City).sendKeys(ct);
	}
	public void state(String state) {
		ldriver.findElement(State).sendKeys(state);
	}
	
	public void zipcode(String zip) {
		ldriver.findElement(zipcode).sendKeys(zip);
		
	}
	public void PhoneNo(String phoneno) {
		ldriver.findElement(PhoneNo).sendKeys(phoneno);
	}
	public void Ssn(String ssN) {
		ldriver.findElement(ssn).sendKeys(ssN);
	}
	public void uName(String uname) {
		ldriver.findElement(username).sendKeys(uname);
		
	}
	public void Password(String pwd) {
		ldriver.findElement(password).sendKeys(pwd);
		
	}
	public void Confirm(String rpwd) {
		ldriver.findElement(confirmpwd).sendKeys(rpwd);
		
	}
	public void clickonR2gister() {
		ldriver.findElement(R2gister).click();
	}
	
}
