Feature: To test cucumber attributes via Application Login
// Scenarios Regular expression - Different data sets but same implementation

@RegressionTest
Scenario: Successful Login of App
Given User lands on the app login page
When User logins app using username "Arun" and password "Arun@123"
Then Application Homepage is displayed
And User profile name button should be displayed
