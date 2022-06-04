package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFunds {
public WebDriver ldriver;
	
	public TransferFunds(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()='Transfer Funds']")
	WebElement TransferAm;
	
	@FindBy(xpath="//input[@id='amount']")
	WebElement Amount;
	
	@FindBy(xpath="//select[@id='fromAccountId']")
	WebElement FromAC;
	
	@FindBy(xpath="//select[@id='toAccountId']")
	WebElement ToAC;
	
	@FindBy(xpath="//input[@value='Transfer']")
	WebElement Transfer;
	
	@FindBy(xpath="//b[@class='ng-binding']")
	WebElement Balance;
	
	public void ClickonTransferFunds() {
		TransferAm.click();
	}
	
	
		
	public void UEA(String string)
	{
		
		Amount.sendKeys(string);
		
	}
	
	
	public void CTB() {
		Transfer.click();
	}



	



	


	



	

}
