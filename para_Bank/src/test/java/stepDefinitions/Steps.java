package stepDefinitions;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.tools.ant.taskdefs.Get;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ch.qos.logback.core.net.SyslogOutputStream;
import cucumber.api.java.en.*;
import pageObjects.Bill_payment;
import pageObjects.CustomerRegister;
import pageObjects.LoginPage;
import pageObjects.Open_New_Acc;
import pageObjects.TransferFunds;
import pageObjects.Update_info;

public class Steps extends BaseClass{
	
	
	
	
	
	
	
	@Given("User Launch chrome browser")
	public void user_Launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		lp=new LoginPage(driver);
		cr=new CustomerRegister(driver);
	    TF=new TransferFunds(driver);
	    BP=new Bill_payment(driver);
	    UP=new Update_info(driver);
	    ONA=new Open_New_Acc(driver);
	    
	    
	    
	}

	@When("User open URL")
	public void user_open_URL(){
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	    
	}

	@When("User Enter name as{string}and password as{string}")
	public void user_Enter_name_as_and_password_as(String u1, String u2) {
	    lp.setuserName(u1);
	    lp.setpassWord(u2);
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		lp.clickLogin();
		
		Thread.sleep(3000);
		
		
		
	   
	}
	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) throws InterruptedException {
		if(driver.getPageSource().contains("Please enter a username and password."))
		   {
			   driver.close();
			   Assert.assertTrue(false);
		   }
		   else if(driver.getPageSource().contains("The username and password could not be verified.")){
			   driver.close();
			   Assert.assertTrue(false);
		   }else {
			   Assert.assertEquals(title, driver.getTitle());
		   }
		   Thread.sleep(3000);
	}

	

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(3000);
	    
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
		
	      
	}
	
	// Open_New_Account
	
	
	@Then("Click on Open_New_Account")
	public void click_on_Open_New_Account() {
		ONA.clickon_Newacc();
	}

	
	
	@Then("Select the Account Type as {string}")
	public void select_the_Account_Type_as(String string) {
		Select s=new Select(driver.findElement(By.xpath("//select[@id='type']")));
		List<WebElement> options=s.getOptions();
		options.stream().forEach(option->{
			if(option.getText().equals(string))
			{
				s.selectByVisibleText(string);
			}else {
				
			}
			
		});
	}

	
	
	@Then("Select the existingAccountNo. as {string}")
	public void select_the_existingAccountNo_as(String string) {
		Select s=new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
		List<WebElement> options=s.getOptions();
		options.stream().forEach(option->{
			if(option.getText().equals(string))
			{
				
				s.selectByVisibleText(string);
			}
			
			
		});
	}


	
	
	@Then("Clickon OpenNewAcc")
	public void clickon_OpenNewAcc() throws NumberFormatException, IOException {
		
		ONA.clickon_open();
		
		if(driver.getPageSource().equals("Account should have minuimum balance $100"))
		{
			driver.close();
		}
	}

	@Then("Validate the pagecorrect or not")
	public void validate_the_pagecorrect_or_not() throws InterruptedException, IOException {
		WebElement AccOpen=driver.findElement(By.xpath("//div/h1[text()='Account Opened!']"));
		Thread.sleep(1000);
		Assert.assertEquals(AccOpen.getText(), "Account Opened!");
		
		Thread.sleep(3000);
		//ScreenShot
				TakesScreenshot scrShot =((TakesScreenshot)driver);

		        
		                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		           

		                File DestFile=new File("C:\\Users\\badhr\\eclipse-workspace\\para_Bank\\Screenshot.png");

		                

		                FileUtils.copyFile(SrcFile, DestFile);
	    
	}


	
	//CustomerRegister
	
	
	@When("User open URL {string}")
	public void user_open_URL(String rurl) {
	    driver.get(rurl);
	}

	@When("Click on Registerlink")
	public void click_on_Registerlink() throws InterruptedException {
		Thread.sleep(3000);
		cr.ClickonRegister();
	    
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String pgtitle) {
		 cr=new CustomerRegister(driver);
	    Assert.assertEquals(pgtitle, cr.getPageTitle());
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
	   String us2name=randomestring();
	   String us3name=randomestring();
	   cr.Firstname(us2name);
	   cr.Lastname(us3name);
	   cr.address("kundanahalligate");
	   cr.city("Banglore");
	   cr.state("Karnataka");
	   cr.zipcode("560037");
	   cr.PhoneNo("56894256");
	   cr.Ssn("5899");
	   cr.uName(us2name);
	   cr.Password(us3name);
	   cr.Confirm(us3name);
	   
	}

	@When("click on register")
	public void click_on_register() throws InterruptedException {
	    cr.clickonR2gister();
	    Thread.sleep(3000);
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String crtitle) {
	    Assert.assertEquals(crtitle, cr.getPageTitle());
	}
	
	
	// Transfer Funds
	
	
	@Then("Click on Transfer Fundss")
	public void click_on_Transfer_Fundss() {
		TF.ClickonTransferFunds();
	    
	}
	
	
	
	

	@Then("User Enter amount as {string}")
	public void user_Enter_amount_as(String string) {
		TF.UEA(string);
		
	}


	@Then("select From as {string}")
	public void select_From_as(String string) {
		
		Select s=new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
		List<WebElement> options=s.getOptions();
		options.stream().forEach(option->{
			if(option.getText().equals(string))
			{
				s.selectByVisibleText(string);
			}
			
		
			
			
		});
		
		
		 
	}

	@Then("To accounts as {string}")
	public void to_accounts_as(String string) {
		
		Select s=new Select(driver.findElement(By.xpath("//select[@id='toAccountId']")));
		List<WebElement> optionsTO=s.getOptions();
		optionsTO.stream().forEach(option->{
			if(option.getText().equals(string))
			{
				s.selectByVisibleText(string);
			}
			
			
		});
		
		
	  
	}



	@Then("Click on Transfer")
	public void click_on_Transfer() throws InterruptedException, IOException {
	    TF.CTB();
	    Thread.sleep(1000);
	    if(driver.getPageSource().contains("The amount cannot be empty."))
	    {
	    	driver.close();
	    	
	    }else if(driver.getPageSource().contains("The Balance is not enough"))
	    {
	    	driver.close();
	    }
	    
	  //ScreenShot
		TakesScreenshot scrShot =((TakesScreenshot)driver);

        
                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

           

                File DestFile=new File("C:\\Users\\badhr\\eclipse-workspace\\para_Bank\\Screenshot.png");

                

                FileUtils.copyFile(SrcFile, DestFile);
	   
	}
	
	
	// Bill payment
	
	@Then("Click on Bill Pay")
	public void click_on_Bill_Pay() {
		BP.click_BP();
	}

	

	
	
	@When("User enter Enter Payeename as {string} and Address as {string} and City as {string} and State as {string} and Zipcode as {string} and Phoneno as {string}")
	public void user_enter_Enter_Payeename_as_and_Address_as_and_City_as_and_State_as_and_Zipcode_as_and_Phoneno_as(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
		BP.payeName(string);
	    BP.Address(string2);
	    BP.City(string3);
	    BP.State(string4);
	    BP.Zip_code(string5);
	    BP.Phone(string6);
	    
	    Thread.sleep(3000);
	}

	
	
	

	
		@When("User Enter Account as {string}")
		public void user_Enter_Account_as(String string) {
			BP.Account(string);
			
		}
		
		@Then("User Enter CofirmAccount as {string}")
		public void user_Enter_CofirmAccount_as(String string) {
		    BP.ConfirmAcc(string);
		}

		@Then("User Enter payAmount as {string}")
		public void user_Enter_payAmount_as(String string) {
			BP.amount(string);
		}

		@Then("User select the from Account as {string}")
		public void user_select_the_from_Account_as(String string) {
			Select s=new Select(driver.findElement(By.xpath("//select[@name='fromAccountId']")));
			List<WebElement> optionsTO=s.getOptions();
			optionsTO.stream().forEach(option->{
				if(option.getText().equals(string))
				{
					s.selectByVisibleText(string);
				}
				
				
			});
		}
		
		@Then("Click on send payment")
		public void click_on_send_payment() throws InterruptedException {
			
		   BP.clickFBP();
		   
		  if(driver.getTitle().equals("ParaBank | Bill Payment Complete"))
		  {
			  
		  }
		  else {
			  driver.close();
		  }
		   
		  
		}
		
		
		

		// Update info
		
		@Then("User click on update_contact Info")
		public void user_click_on_update_contact_Info() {
		    UP.updateInfo();
		}

		@Then("User enter the update info")
		public void user_enter_the_update_info() {
		/*	WebElement FirstName=driver.findElement(By.xpath("//input[@name='customer.firstName']"));
			WebElement LastName=driver.findElement(By.xpath("//input[@name='customer.lastName']"));
			WebElement Address=driver.findElement(By.xpath("//input[@name='customer.address.street']"));
			WebElement City=driver.findElement(By.xpath("//input[@name='customer.address.city']"));
			WebElement State=driver.findElement(By.xpath("//input[@name='customer.address.state']"));
			WebElement Zipcode=driver.findElement(By.xpath("//input[@name='customer.address.zipCode']"));
		    Assert.assertEquals("John",FirstName.getText());
		    Assert.assertEquals("Smith",LastName.getText());
		    Assert.assertEquals("1431 Main St",Address.getText());
		    Assert.assertEquals("Beverly Hills",City.getText());
		    Assert.assertEquals("CA",State.getText());
		    Assert.assertEquals("90210",Zipcode.getText());*/
		    
		   // WebElement ele=driver.findElement(By.xpath("//input[@name='customer.phoneNumber']"));
		    
	
		}
		
		@Then("User enter the update info Phoneno as {string}")
		public void user_enter_the_update_info_Phoneno_as(String string) {
			UP.phoneno_update(string);
		}

		@Then("click on update profile")
		public void click_on_update_profile() {
		    UP.Click_updatepro();
		}

		@When("user updated sucussfully")
		public void user_updated_sucussfully() {
		   
		}


	


}
