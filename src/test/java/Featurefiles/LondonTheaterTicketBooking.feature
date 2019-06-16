Feature: Automating London Theater Website

@RegressionTest
Scenario: Verify user able to book the ticket for particular movie 

	Given I launch the URL
	When i am in HomePage find the search text and enter "The Lion King" in search and click on Booknow button
	Then select the date on which tickets available and select the seats
	Then Enter user and card details
	
	