$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Update_Info.feature");
formatter.feature({
  "name": "Update_info",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Phonenumber Update",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open URL",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_open_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter name as\"john\"and password as\"demo\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Enter_name_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"ParaBank | Accounts Overview\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on update_contact Info",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_update_contact_Info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"ParaBank | Update Profile\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the update info Phoneno as \"310-447-4123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_the_update_info_Phoneno_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on update profile",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_update_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user updated sucussfully",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_updated_sucussfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Phno_update",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User open URL",
  "keyword": "When "
});
formatter.step({
  "name": "User Enter name as\"john\"and password as\"demo\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.step({
  "name": "Page Title should be \"ParaBank | Accounts Overview\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on update_contact Info",
  "keyword": "And "
});
formatter.step({
  "name": "Page Title should be \"ParaBank | Update Profile\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User enter the update info Phoneno as \"\u003cupdatephno\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on update profile",
  "keyword": "Then "
});
formatter.step({
  "name": "user updated sucussfully",
  "keyword": "When "
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "Then "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "updatephno"
      ]
    },
    {
      "cells": [
        "310-447-4123"
      ]
    },
    {
      "cells": [
        "310-447-41234574"
      ]
    },
    {
      "cells": [
        "310-447-4123hjhfg"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Phno_update",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open URL",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_open_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter name as\"john\"and password as\"demo\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Enter_name_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"ParaBank | Accounts Overview\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on update_contact Info",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_update_contact_Info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"ParaBank | Update Profile\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the update info Phoneno as \"310-447-4123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_the_update_info_Phoneno_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on update profile",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_update_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user updated sucussfully",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_updated_sucussfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Phno_update",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open URL",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_open_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter name as\"john\"and password as\"demo\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Enter_name_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"ParaBank | Accounts Overview\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on update_contact Info",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_update_contact_Info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"ParaBank | Update Profile\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the update info Phoneno as \"310-447-41234574\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_the_update_info_Phoneno_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on update profile",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_update_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user updated sucussfully",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_updated_sucussfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Phno_update",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open URL",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_open_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter name as\"john\"and password as\"demo\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Enter_name_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"ParaBank | Accounts Overview\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on update_contact Info",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_update_contact_Info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"ParaBank | Update Profile\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the update info Phoneno as \"310-447-4123hjhfg\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_the_update_info_Phoneno_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on update profile",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_update_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user updated sucussfully",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_updated_sucussfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});