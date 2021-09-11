$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/createAnOrder.feature");
formatter.feature({
  "name": "Swag Labs",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create and order function",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open browser with \"https://www.saucedemo.com/\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I input \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User login to homepage to verify homepage as \"Swag Labs\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User click on a product",
  "keyword": "When "
});
formatter.step({
  "name": "User click on add to cart",
  "keyword": "And "
});
formatter.step({
  "name": "user view the cart",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on checkout",
  "keyword": "And "
});
formatter.step({
  "name": "user fillout the info as firstName \"Yas\" lastName \"Asif\" and zip \"19082\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on finish",
  "keyword": "And "
});
formatter.step({
  "name": "Driver Close",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create and order function",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open browser with \"https://www.saucedemo.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.steps.open_browser_with(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input \"standard_user\" and \"secret_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.steps.i_input_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login to homepage to verify homepage as \"Swag Labs\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.steps.user_login_to_homepage_to_verify_homepage_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on a product",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.steps.user_click_on_a_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.steps.user_click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user view the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.steps.user_view_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on checkout",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.steps.user_click_on_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fillout the info as firstName \"Yas\" lastName \"Asif\" and zip \"19082\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.steps.user_fillout_the_info_as_firstName_lastName_and_zip(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on finish",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.steps.user_click_on_finish()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver Close",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.steps.driver_Close()"
});
formatter.result({
  "status": "passed"
});
});