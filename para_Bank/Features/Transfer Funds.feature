Feature: Transfer Amount

Scenario: Send Amount
	Given User Launch chrome browser
	When User open URL
	And User Enter name as"john"and password as"demo"
	And Click on login
	Then Page Title should be "ParaBank | Accounts Overview"
	And Click on Transfer Fundss
	Then Page Title should be "ParaBank | Transfer Funds"
	And User Enter amount as "1024"
	Then select From as "15564" 
	And To accounts as "16008"
	And Click on Transfer
	When User click on Log out link
	Then Page Title should be "ParaBank | Welcome | Online Banking"
	And close browser
	
Scenario Outline: Transfer Funds Data Driven
	Given User Launch chrome browser
	When User open URL
	And User Enter name as"john"and password as"demo"
	And Click on login
	Then Page Title should be "ParaBank | Accounts Overview"
	And Click on Transfer Fundss
	Then Page Title should be "ParaBank | Transfer Funds"
	And User Enter amount as "<Amount>"
	Then select From as "<FromAcc>" 
	And To accounts as "<ToAcc>"
	And Click on Transfer
	When User click on Log out link
	Then Page Title should be "ParaBank | Welcome | Online Banking"
	And close browser
	
	Examples:
		| Amount | FromAcc | ToAcc |
		| 00 | 13677 | 14787 |
		| | 12345 | 54321 |
		| 25365412 | 14787 | 13677 |