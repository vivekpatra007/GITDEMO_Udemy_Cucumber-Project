Feature: Application Login

//"Scenario Outline:" KW is used in case of scenario with multiple test datasets
//"Examples:" KW is used to pass multiple datasets under the parameters 

@sanityTest
Scenario Outline: Successful Login of Application page
Given User is on the app login page
When User logins into app with <username> and <password>
Then App Homepage is displayed
And User profile name button is displayed

Examples:
|username|password|
|User1   |pass1   |
|User2   |pass2   |
|User3   |pass3   |

@smokeTest
Scenario Outline: Successful Login of Application page
Given User is on the app login page
When User logins into app with <username1> and <password1>
Then App Homepage is displayed
And User profile name button is displayed

Examples:
|username1|password1|
|US1     |PS1     |
|US2     |PS2     |
|US3     |PS3     |