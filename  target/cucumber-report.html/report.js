$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MyProfile.feature");
formatter.feature({
  "name": "Search My profile",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User landing to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "wordpress.step_definitions.LoginStepDef.user_landing_to_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid username and password for login",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "wordpress.step_definitions.LoginStepDef.user_enter_valid_username_and_password_for_login(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user able to loging successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "wordpress.step_definitions.LoginStepDef.verify_user_able_to_loging_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Information Update on MyProfile page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@myprofile"
    }
  ]
});
formatter.step({
  "name": "User navigates to MyProfile page",
  "keyword": "When "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.user_navigates_to_MyProfile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "First Name and Last Name should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User logs out of Word Press",
  "keyword": "Then "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.user_logs_out_of_WordPress()"
});
formatter.result({
  "status": "skipped"
});
});