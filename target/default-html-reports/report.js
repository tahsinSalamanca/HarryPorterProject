$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/sortingHats.feature");
formatter.feature({
  "name": "Sorting Hats",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sorting Hats",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "set URI",
  "keyword": "Given "
});
formatter.match({
  "location": "SortingHats.set_URI()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user send get request",
  "keyword": "When "
});
formatter.match({
  "location": "SortingHats.the_user_send_get_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the statusCode is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "SortingHats.verify_the_statusCode_is(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Content Type is is \"application/json; charset\u003dutf-8\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SortingHats.verify_the_Content_Type_is_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Rensponse body contains  one of",
  "rows": [
    {
      "cells": [
        "\"Gryffindor\"",
        "\"Ravenclaw\"",
        "Slytherin",
        "Hufflepuff"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SortingHats.rensponse_body_contains_one_of(String\u003e)"
});
formatter.result({
  "status": "passed"
});
});