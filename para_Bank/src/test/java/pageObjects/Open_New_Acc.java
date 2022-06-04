package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Open_New_Acc {
	
	public WebDriver ldriver;
	
	public Open_New_Acc(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()='Open New Account']")
	WebElement Click_on_New_Acc;
	
	@FindBy(xpath="//select[@id='type']")
	WebElement select_Acc_type;
	
	@FindBy(xpath="//select[@id='fromAccountId']")
	WebElement select_From_Acc;
	
	@FindBy(xpath="//input[@value='Open New Account']")
	WebElement clickon_Open;
	
	public void clickon_Newacc()
	{
		Click_on_New_Acc.click();
	}
	
	public void clickon_open()
	{
		clickon_Open.click();
	}

}
