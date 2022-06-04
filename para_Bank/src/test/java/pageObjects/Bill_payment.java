package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bill_payment {
	
public WebDriver ldriver;
	
	public Bill_payment(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()='Bill Pay']")
	WebElement bill_pay;
	
	@FindBy(xpath="//input[@name='payee.name']")
	WebElement payeeName;
	
	@FindBy(xpath="//input[@name='payee.address.street']")
	WebElement Adress;
	
	@FindBy(xpath="//input[@name='payee.address.city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='payee.address.state']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='payee.address.zipCode']")
	WebElement zipcd;
	
	@FindBy(xpath="//input[@name='payee.phoneNumber']")
	WebElement phone;
	
	@FindBy(xpath="//input[@name='payee.accountNumber']")
	WebElement Account;
	
	@FindBy(xpath="//input[@name='verifyAccount']")
	WebElement Confacc;
	
	@FindBy(xpath="//input[@name='amount']")
	WebElement Amount;
	
	@FindBy(xpath="//input[@value='Send Payment']")
	WebElement Bill_Btn;
	
	public void click_BP()
	{
		bill_pay.click();
	}
	
	public void payeName(String pn)
	{
		payeeName.sendKeys(pn);
	}
	
	public void Address(String ad)
	{
		Adress.sendKeys(ad);
	}
	
	public void City(String ct)
	{
		city.sendKeys(ct);
	}
	
	public void State(String st)
	{
		state.sendKeys(st);
	}
	
	public void Zip_code(String zd)
	{
		zipcd.sendKeys(zd);
	}
	
	public void Phone(String ph)
	{
		phone.sendKeys(ph);
	}
	
	public void Account(String acc)
	{
		Account.sendKeys(acc);
		
	}
	public void ConfirmAcc(String cacc)
	{
		Confacc.sendKeys(cacc);
	}
	
	public void amount(String am)
	{
		Amount.sendKeys(am);
	}
	public void clickFBP()
	{
		Bill_Btn.click();
	}

}
