Feature: Clean login functionality 
#Background common functionality for each scenario 
#Background:


Scenario: Checking the vanila login function
Given I am on the facebook login page
When I entered "username" and "password"
And I clicked on the login button
Then I should navigate successfully to the home page
