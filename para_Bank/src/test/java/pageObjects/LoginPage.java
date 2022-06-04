package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@class='input']")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement passWord;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(xpath="//a[text()='Log Out']")
	WebElement btnLogout;
	
	public void setuserName(String u1name)
	{
		userName.clear();
		
		userName.sendKeys(u1name);
	}

	public void setpassWord(String pd)
	{
		passWord.clear();
		passWord.sendKeys(pd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		btnLogout.click();
	}
}
