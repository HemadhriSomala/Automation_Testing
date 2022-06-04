package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.Bill_payment;
import pageObjects.CustomerRegister;
import pageObjects.LoginPage;
import pageObjects.Open_New_Acc;
import pageObjects.TransferFunds;
import pageObjects.Update_info;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public CustomerRegister cr;
	public TransferFunds TF;
	public Bill_payment BP;
	public Update_info UP;
	public Open_New_Acc ONA;
	
	
	
	//Created for generating random string for unique username
	public static String randomestring() {
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}

}
