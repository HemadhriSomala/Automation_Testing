Feature: Bill_pay

Scenario: Billpay
	Given User Launch chrome browser
	When User open URL
	And User Enter name as"john"and password as"demo"
	And Click on login
	Then Page Title should be "ParaBank | Accounts Overview"
	And Click on Bill Pay
	Then Page Title should be "ParaBank | Bill Pay"
	When User enter Enter Payeename as "Badri" and Address as "Marathalli" and City as "Banglore" and State as "Karnataka" and Zipcode as "560068" and Phoneno as "9538913037"
	And User Enter Account as "13122"
	Then User Enter CofirmAccount as "13122"
	Then User Enter payAmount as "102" 
	And User select the from Account as "13344"
	And Click on send payment
	Then Page Title should be "ParaBank | Bill Payment Complete"
	When User click on Log out link
	Then Page Title should be "ParaBank | Welcome | Online Banking"
	And close browser
	
Scenario Outline:
	Given User Launch chrome browser
	When User open URL
	And User Enter name as"john"and password as"demo"
	And Click on login
	Then Page Title should be "ParaBank | Accounts Overview"
	And Click on Bill Pay
	Then Page Title should be "ParaBank | Bill Pay"
	When User enter Enter Payeename as "<Payeename>" and Address as "<Address>" and City as "<City>" and State as "<State>" and Zipcode as "<Zipcode>" and Phoneno as "<Phoneno>"
	And User Enter Account as "<Account>"
	Then User Enter CofirmAccount as "<ConfirmAcc>"
	Then User Enter payAmount as "<PayAmount>"
	And User select the from Account as "<FromAcc>"
	And Click on send payment
	Then Page Title should be "ParaBank | Bill Payment Complete"
	When User click on Log out link
	Then Page Title should be "ParaBank | Welcome | Online Banking"
	And close browser
	
	Examples:
	| Payeename | Address | City | State | Zipcode | Phoneno | Account | ConfirmAcc | PayAmount | FromAcc |
	|| Marathalli | Banglore | Karnataka | 560068 | 9538913037 | 13122 | 13122 | 102 | 13344 |
	| Badri || Banglore | Karnataka | 560068 | 9538913037 | 13122 | 13122 | 102 | 13344 |
	| Badri | Marathalli || Karnataka | 560068 | 9538913037 | 13122 | 13122 | 102 | 13344 |
	|Badri| Marathalli | Banglore | Karnataka | Badri | 9538913037 | 13122 | 13122 | 102 | 13344 |
	| Badri | Marathalli | Banglore | Karnataka | 560068 | 953891303712 | 13122 | 13122 | 102 | 13344 |
	| Badri | Marathalli | Banglore | Karnataka | 560068 | 9538913037 | 13122 | 13127 | 102 | 13344 |
	| Badri | Marathalli | Banglore | Karnataka | 560068 | 9538913037 | 13122 | 13122 | 256478 | 13344 |