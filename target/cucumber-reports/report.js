$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountInformation.feature");
formatter.feature({
  "line": 1,
  "name": "Account information",
  "description": "",
  "id": "account-information",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4066002300,
  "status": "passed"
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
  "name": "user logs in with username \"jsmith@demo.io\" and password \"Demo123!\"",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "jsmith@demo.io",
      "offset": 28
    },
    {
      "val": "Demo123!",
      "offset": 58
    }
  ],
  "location": "AccountInformationSteps.user_logs_in_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 132046700,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Validate welcome message",
  "description": "",
  "id": "account-information;validate-welcome-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user should see message \"Welcome Josh\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome Josh",
      "offset": 25
    }
  ],
  "location": "AccountInformationSteps.user_should_see_message(String)"
});
formatter.result({
  "duration": 43400,
  "status": "passed"
});
formatter.after({
  "duration": 783408800,
  "status": "passed"
});
formatter.before({
  "duration": 1874753000,
  "status": "passed"
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
  "name": "user logs in with username \"jsmith@demo.io\" and password \"Demo123!\"",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "jsmith@demo.io",
      "offset": 28
    },
    {
      "val": "Demo123!",
      "offset": 58
    }
  ],
  "location": "AccountInformationSteps.user_logs_in_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 90600,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Home title verification",
  "description": "",
  "id": "account-information;home-title-verification",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user should be able to see Home title",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountInformationSteps.user_should_be_able_to_see_Home_title()"
});
formatter.result({
  "duration": 37400,
  "status": "passed"
});
formatter.after({
  "duration": 1027188100,
  "status": "passed"
});
