Feature: Customer Register

Scenario: Create new profile
	Given User Launch chrome browser
	When User open URL "https://parabank.parasoft.com/parabank/index.htm"
	And Click on Registerlink
	Then Page title should be "ParaBank | Register for Free Online Account Access"
	When User enter customer info
	And click on register
	Then User can view confirmation message "ParaBank | Customer Created"
	And close browser