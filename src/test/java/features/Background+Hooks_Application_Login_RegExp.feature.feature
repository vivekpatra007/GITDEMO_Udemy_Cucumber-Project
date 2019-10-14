Feature: Application Sign Up

// Scenarios Data Table - Different data sets but same implementation
//DadtaTable api is called
//DataTable.raw() is called

Background:
Given Backkgound details are available
When User uses the Backkgound details
Then Background is executed


@RegressTestwithBackground
Scenario: Successful Login of Application page
Given User is on the app login page
When User logins into  app with username "Arun" and password "Arun@123"
Then App Homepage is displayed
And User profile name button is displayed

@RegressTestwithBackground
Scenario: User Photo is displayed on Application page after Successful Login
Given User is on the app login page
When User logins into  app with username "Bob" and password "Bob@123"
Then App Homepage is displayed
And User Photo is displayed
