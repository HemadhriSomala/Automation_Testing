Feature: New_Account

Scenario: Create_New_Account

	Given User Launch chrome browser
	When User open URL
	And User Enter name as"john"and password as"demo"
	And Click on login
	Then Page Title should be "ParaBank | Accounts Overview"
	And Click on Open_New_Account
	Then Page Title should be "ParaBank | Open Account"
	Then Select the Account Type as "CHECKING"
	And Select the existingAccountNo. as "13566"
	Then Clickon OpenNewAcc
	And Validate the pagecorrect or not
	When User click on Log out link
	Then Page Title should be "ParaBank | Welcome | Online Banking"
	And close browser
	
Scenario Outline: NewAccount
	Given User Launch chrome browser
	When User open URL
	And User Enter name as"john"and password as"demo"
	And Click on login
	Then Page Title should be "ParaBank | Accounts Overview"
	And Click on Open_New_Account
	Then Page Title should be "ParaBank | Open Account"
	Then Select the Account Type as "<Accounttype>"
	And Select the existingAccountNo. as "<ExistAcc>"
	Then Clickon OpenNewAcc
	And Validate the pagecorrect or not
	When User click on Log out link
	Then Page Title should be "ParaBank | Welcome | Online Banking"
	And close browser
	
	Examples:
	| Accounttype | ExistAcc |
	| SAVINGS | 1334 |
