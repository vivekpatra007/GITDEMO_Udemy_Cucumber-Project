Feature: Application Sign Up

// Scenarios Data Table - Different data sets but same implementation
//DadtaTable api is called
//DataTable.raw() is called

@sanityTest
Scenario: User is able to sign up on Application page
Given User is on the app login page
When User signs up using following details
| Raj   | Malhotra | raj.malhotra@abcd.com | +91-123456789 | INDIA |
| Rahul | Mehra | rahul.mehra@abcd.com | +91-222256789 | USA |
| Pooja | Singh | pooja.singh@abcd.com | +91-888856789 | USA |
Then User sign up is succesfull

@smokeTest
Scenario: User is able to sign up on Application page
Given User is on the app login page
When User signs up using following details
| Ram   | Kumar | ram.kumar@abcd.com   | +91-333356789 | USA |
| Priya | Singh | priya.singh@abcd.com | +91-44456789 | USA |
| Akhil | Singh | akhil.singh@abcd.com | +91-55556789 | USA |
Then User sign up is succesfull
