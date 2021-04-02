Feature: verifiying the adactin login page and booking page. 

Background: 
	Given  user is on the adactin page 
	When  user should enter username and password 
	And  user should clik login button 

@smoke	
Scenario: TC_01   verifying the adatin hotel details with valid credentails 
	Then  user should verify sucess message. 
Scenario: TC_02 verifying the search hotel page with valid credentails 

	And  user is on the search hotel page 
	When user should enter valid credentials 
	And user should click on search button 
	Then  user should verify succes message. 
	@regresition
Scenario: TC_03 verfiying the hotel selection page 

	And  user is on the search hotel page 
	When user should enter valid credentials 
	And user should click on search button 
	And user should click on radio button or hotel select button 
	And user should click on continue button 
	Then user verify the succes message and navigate to next page. 
	@sanity
Scenario: TC_04 verifing the all feild with valid credentials without enter creditcard number in Book a hotel page 
	
	And  user is on the search hotel page 
	When user should enter valid credentials 
	And user should click on search button 
	And user should click on radio button or hotel select button 
	And user should click on continue button 
	And user should be enter firstname,Lastname,billing address,Creditcard type,Expirydate,Cvv number 
	Then user should verify the error msg without enter Creditcard number.
	@samoke @regresition
Scenario: TC_05  verifing the all feild with valid credentials without select creditcard type in Book a hotel page 
	
	And  user is on the search hotel page 
	When user should enter valid credentials 
	And user should click on search button 
	And user should click on radio button or hotel select button 
	And user should click on continue button 
	And user should be enter firstname,Lastname,billing address,Creditcard number,Expirydate,Cvv number 
	Then user should verify the error msg without select Creditcard type.
	@sanity 
Scenario: TC_06 verifing the all feild with valid credentials without enter Expirydate in Book a hotel page 
	 
	And  user is on the search hotel page 
	When user should enter valid credentials 
	And user should click on search button 
	And user should click on radio button or hotel select button 
	And user should click on continue button 
	And user should be enter firstname,Lastname,billing address,Creditcard number,Creditcard type,Cvv number 
	Then user should verify the error msg without enter Expirydate.
	@smoke @sanity 
Scenario: TC_07 verifing the all feild with valid credentials without enter CVV number in Book a hotel page 
	
	And  user is on the search hotel page 
	When user should enter valid credentials 
	And user should click on search button 
	And user should click on radio button or hotel select button 
	And user should click on continue button 
	And user should be enter firstname,Lastname,billing address,Creditcard number,Creditcard type,Expirydate 
	Then user should verify the error msg without enter CVV number. 
				