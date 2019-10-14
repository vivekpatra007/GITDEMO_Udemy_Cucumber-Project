Feature: Application Login
// Scenarios Regular expression - Different data sets but same implementation

@RegressTest
Scenario: Successful Login of Application page
Given User is on the app login page
When User logins into  app with username "Arun" and password "Arun@123"
Then App Homepage is displayed
And User profile name button is displayed

@RegressTest
Scenario: User Photo is displayed on Application page after Successful Login
Given User is on the app login page
When User logins into  app with username "Bob" and password "Bob@123"
Then App Homepage is displayed
And User Photo is displayed