$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/AdactinHotel.feature");
formatter.feature({
  "name": "To validate login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate login functionality with valid username and valid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User select \"\u003cLocation\u003e\",\"\u003cHotel\u003e\",\"\u003cRoomtype\u003e\",\"\u003cNumberofRooms\u003e\",\"\u003cAdultcount\u003e\",\"\u003cChildrencount\u003e\"and Click SearchButton",
  "keyword": "When "
});
formatter.step({
  "name": "User select the hotel and click continue",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cAddress\u003e\",\"\u003cCardnumber\u003e\",\"\u003cCardtype\u003e\",\"\u003cExpmonth\u003e\",\"\u003cExpYear\u003e\",\"\u003cCVV\u003e\"and click book now",
  "keyword": "And "
});
formatter.step({
  "name": "User should be in confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Location",
        "Hotel",
        "Roomtype",
        "NumberofRooms",
        "Adultcount",
        "Childrencount",
        "FirstName",
        "LastName",
        "Address",
        "Cardnumber",
        "Cardtype",
        "Expmonth",
        "ExpYear",
        "CVV"
      ]
    },
    {
      "cells": [
        "London",
        "Hotel Creek",
        "Standard",
        "1",
        "2",
        "2",
        "pranav",
        "raj",
        "chennai",
        "2345673425432723",
        "VISA",
        "Feb",
        "2022",
        "098"
      ]
    },
    {
      "cells": [
        "NewYork",
        "Hotel Hervey",
        "Double",
        "1",
        "2",
        "2",
        "Sheela",
        "Mathiyazhagan",
        "Madurai",
        "5678902879065432",
        "AmericanExpress",
        "May",
        "2022",
        "065"
      ]
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
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Adactin Hotel login page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinHotel.user_is_in_Adactin_Hotel_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid username and password",
  "rows": [
    {
      "cells": [
        "sheelamathiyazhagan",
        "poonguzhali"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdactinHotel.user_enter_valid_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotel.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login functionality with valid username and valid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User select \"London\",\"Hotel Creek\",\"Standard\",\"1\",\"2\",\"2\"and Click SearchButton",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinHotel.user_select_and_Click_SearchButton(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the hotel and click continue",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotel.user_select_the_hotel_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"pranav\",\"raj\",\"chennai\",\"2345673425432723\",\"VISA\",\"Feb\",\"2022\",\"098\"and click book now",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotel.user_enters_and_click_book_now(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinHotel.user_should_be_in_confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
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
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Adactin Hotel login page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinHotel.user_is_in_Adactin_Hotel_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid username and password",
  "rows": [
    {
      "cells": [
        "sheelamathiyazhagan",
        "poonguzhali"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdactinHotel.user_enter_valid_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotel.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login functionality with valid username and valid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User select \"NewYork\",\"Hotel Hervey\",\"Double\",\"1\",\"2\",\"2\"and Click SearchButton",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinHotel.user_select_and_Click_SearchButton(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the hotel and click continue",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotel.user_select_the_hotel_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Sheela\",\"Mathiyazhagan\",\"Madurai\",\"5678902879065432\",\"AmericanExpress\",\"May\",\"2022\",\"065\"and click book now",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotel.user_enters_and_click_book_now(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinHotel.user_should_be_in_confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});