$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/FeaturesFiles/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page Fonctionality verification",
  "description": "",
  "id": "login-page-fonctionality-verification",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launches browser and navigate to www.amazon.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on your amazon.com link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_launches_browser_and_navigate_to_www_amazon_com()"
});
formatter.result({
  "duration": 8864736696,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_your_amazon_com_link()"
});
formatter.result({
  "duration": 5994593291,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "#Then user should be navigated to login page"
    },
    {
      "line": 11,
      "value": "#And user should see email,pw,edit box and login button"
    },
    {
      "line": 12,
      "value": "#And user closes the application"
    }
  ],
  "line": 15,
  "name": "Login Success Verification",
  "description": "",
  "id": "login-page-fonctionality-verification;login-success-verification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@smoke"
    },
    {
      "line": 14,
      "name": "@regretion"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "enters valid username \"tester123@gmail.com\" and paw \"tester123\" and click on sign on",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "verify user is logged in successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user closes the application",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "tester123@gmail.com",
      "offset": 23
    },
    {
      "val": "tester123",
      "offset": 53
    }
  ],
  "location": "LoginPageSteps.userCredentials(String,String)"
});
formatter.result({
  "duration": 1684261607,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.verify_user_is_logged_in_successfully()"
});
formatter.result({
  "duration": 52660232,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_closes_the_application()"
});
formatter.result({
  "duration": 1723934132,
  "status": "passed"
});
});