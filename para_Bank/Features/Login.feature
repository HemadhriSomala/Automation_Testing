Feature: Login

Scenario: Successful Login with Valid credintials

	Given User Launch chrome browser
	When User open URL
	And User Enter name as"john"and password as"demo"
	And Click on login
	Then Page Title should be "ParaBank | Accounts Overview"
	When User click on Log out link
	Then Page Title should be "ParaBank | Welcome | Online Banking"
	And close browser
	
Scenario Outline: Login Data Driven
	Given User Launch chrome browser
	When User open URL
	And User Enter name as"<username>"and password as"<password>"
	And Click on login
	Then Page Title should be "ParaBank | Accounts Overview"
	When User click on Log out link
	Then Page Title should be "ParaBank | Welcome | Online Banking"
	And close browser
	
	Examples:
		| username | password |
		| john | DEMO |
		| JOHN | demo |
		|||
		
		