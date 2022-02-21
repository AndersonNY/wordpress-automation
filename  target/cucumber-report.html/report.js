$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MyProfile.feature");
formatter.feature({
  "name": "Search My profile",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
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
formatter.scenario({
  "name": "User Updates MyProfile Information on my profile page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User navigates to My Profile page",
  "keyword": "When "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.user_navigates_to_MyProfile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User changes First and Last Name to",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.user_changes_First_Name_and_Last_Name(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provide public display name as \"andersonny\"",
  "keyword": "And "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.userProvidePublicDisplayNameAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User writes brief bio in About Me box",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.user_writes_brief_bio_in_About_Me_box(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User updates Hide My Gavatar Profile page",
  "keyword": "And "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.user_updates_Hide_My_Gavatar_Profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks save button",
  "keyword": "When "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs out of Word Press",
  "keyword": "Then "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.user_logs_out_of_WordPress()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MacBook-Pro.hsd1.nj.comcast.net\u0027, ip: \u00272603:301b:1b68:6000:0:0:0:8e65%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u002715.0.2\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteTimeouts.implicitlyWait(RemoteWebDriver.java:780)\n\tat wordpress.step_definitions.Hooks.setUp(Hooks.java:20)\n",
  "status": "failed"
});
formatter.step({
  "name": "User landing to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "wordpress.step_definitions.LoginStepDef.user_landing_to_the_application()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.scenario({
  "name": "User verifies MyProfile Information on my profile page updated",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User navigates to My Profile page",
  "keyword": "When "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.user_navigates_to_MyProfile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies First and Last Name should be",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.userVerifiesFirstAndLastNameShouldBe(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies public display name as \"andersonny\"",
  "keyword": "And "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.userVerifiesPublicDisplayNameAs(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies brief bio in About Me box",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.userVerifiesBriefBioInAboutMeBox(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MacBook-Pro.hsd1.nj.comcast.net\u0027, ip: \u00272603:301b:1b68:6000:0:0:0:8e65%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u002715.0.2\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteTimeouts.implicitlyWait(RemoteWebDriver.java:780)\n\tat wordpress.step_definitions.Hooks.setUp(Hooks.java:20)\n",
  "status": "failed"
});
formatter.step({
  "name": "User landing to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "wordpress.step_definitions.LoginStepDef.user_landing_to_the_application()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.scenario({
  "name": "Validation of side panel sections on My Profile page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User navigates to My Profile page",
  "keyword": "When "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.user_navigates_to_MyProfile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is able to verify following sections are displayed on side panel",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.userIsAbleToVerifyFollowingSectionsAreDisplayedOnSidePanel(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MacBook-Pro.hsd1.nj.comcast.net\u0027, ip: \u00272603:301b:1b68:6000:0:0:0:8e65%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u002715.0.2\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteTimeouts.implicitlyWait(RemoteWebDriver.java:780)\n\tat wordpress.step_definitions.Hooks.setUp(Hooks.java:20)\n",
  "status": "failed"
});
formatter.step({
  "name": "User landing to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "wordpress.step_definitions.LoginStepDef.user_landing_to_the_application()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.scenario({
  "name": "Validation of profile links on My Profile page - last scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User navigates to My Profile page",
  "keyword": "When "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.user_navigates_to_MyProfile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if user is able to click on Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.verifyIfUserIsAbleToClickOnAddButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if user is able to click on Add URL button",
  "keyword": "And "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.verifyIfUserIsAbleToClickOnAddURLButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify if user is able to click on Add WordPress Site",
  "keyword": "And "
});
formatter.match({
  "location": "wordpress.step_definitions.MyProfileStepDef.verifyIfUserIsAbleToClickOnAddWordPressSite()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});