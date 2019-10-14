$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Background+Hooks_Application_Login_RegExp.feature.feature");
formatter.feature({
  "line": 1,
  "name": "Application Sign Up",
  "description": "\r\n// Scenarios Data Table - Different data sets but same implementation\r\n//DadtaTable api is called\r\n//DataTable.raw() is called",
  "id": "application-sign-up",
  "keyword": "Feature"
});
formatter.before({
  "duration": 496281,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "Backkgound details are available",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User uses the Backkgound details",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Background is executed",
  "keyword": "Then "
});
formatter.match({
  "location": "Background.backkgound_details_are_available()"
});
formatter.result({
  "duration": 665189093,
  "status": "passed"
});
formatter.match({
  "location": "Background.user_uses_the_backkgound_details()"
});
formatter.result({
  "duration": 53130,
  "status": "passed"
});
formatter.match({
  "location": "Background.background_is_executed()"
});
formatter.result({
  "duration": 484810,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Successful Login of Application page",
  "description": "",
  "id": "application-sign-up;successful-login-of-application-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@RegressTestwithBackground"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User is on the app login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User logins into  app with username \"Arun\" and password \"Arun@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "App Homepage is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User profile name button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef_Application_Login_RegExp.user_is_on_the_app_login_page()"
});
formatter.result({
  "duration": 406927,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Arun",
      "offset": 37
    },
    {
      "val": "Arun@123",
      "offset": 57
    }
  ],
  "location": "StepDef_Application_Login_RegExp.user_logins_into_app_with_username_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 5738625,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_Application_Login_RegExp.app_homepage_is_displayed()"
});
formatter.result({
  "duration": 195011,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_Application_Login_RegExp.user_profile_name_button_is_displayed()"
});
formatter.result({
  "duration": 503526,
  "status": "passed"
});
formatter.after({
  "duration": 478169,
  "status": "passed"
});
formatter.before({
  "duration": 147314,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "Backkgound details are available",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User uses the Backkgound details",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Background is executed",
  "keyword": "Then "
});
formatter.match({
  "location": "Background.backkgound_details_are_available()"
});
formatter.result({
  "duration": 59167,
  "status": "passed"
});
formatter.match({
  "location": "Background.user_uses_the_backkgound_details()"
});
formatter.result({
  "duration": 36829,
  "status": "passed"
});
formatter.match({
  "location": "Background.background_is_executed()"
});
formatter.result({
  "duration": 86940,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User Photo is displayed on Application page after Successful Login",
  "description": "",
  "id": "application-sign-up;user-photo-is-displayed-on-application-page-after-successful-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@RegressTestwithBackground"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is on the app login page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User logins into  app with username \"Bob\" and password \"Bob@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "App Homepage is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User Photo is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef_Application_Login_RegExp.user_is_on_the_app_login_page()"
});
formatter.result({
  "duration": 114108,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bob",
      "offset": 37
    },
    {
      "val": "Bob@123",
      "offset": 56
    }
  ],
  "location": "StepDef_Application_Login_RegExp.user_logins_into_app_with_username_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 427454,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_Application_Login_RegExp.app_homepage_is_displayed()"
});
formatter.result({
  "duration": 79091,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_Application_Login_RegExp.user_Photo_is_displayed()"
});
formatter.result({
  "duration": 95392,
  "status": "passed"
});
formatter.after({
  "duration": 438925,
  "status": "passed"
});
});