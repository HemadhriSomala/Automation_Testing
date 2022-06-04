Feature: Update_info

Scenario: Phonenumber Update

	Given User Launch chrome browser
	When User open URL
	And User Enter name as"john"and password as"demo"
	And Click on login
	Then Page Title should be "ParaBank | Accounts Overview"
	And User click on update_contact Info
	Then Page Title should be "ParaBank | Update Profile"
	And User enter the update info Phoneno as "310-447-4123"
	Then click on update profile
	When user updated sucussfully
	Then User click on Log out link
	And close browser
Scenario Outline: Phno_update
	Given User Launch chrome browser
	When User open URL
	And User Enter name as"john"and password as"demo"
	And Click on login
	Then Page Title should be "ParaBank | Accounts Overview"
	And User click on update_contact Info
	Then Page Title should be "ParaBank | Update Profile"
	And User enter the update info Phoneno as "<updatephno>"
	Then click on update profile
	When user updated sucussfully
	Then User click on Log out link
	And close browser
	
	Examples:
	| updatephno |
	| 310-447-4123 |
	| 310-447-41234574 |
	| 310-447-4123hjhfg |