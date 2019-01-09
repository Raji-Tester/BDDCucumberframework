$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Jagadeesh/eclipse-workspace/cucumber/src/test/resources/features/Test.feature");
formatter.feature({
  "line": 1,
  "name": "Clear score Task handle",
  "description": "",
  "id": "clear-score-task-handle",
  "keyword": "Feature"
});
formatter.before({
  "duration": 51956325255,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Check the clear score calculator",
  "description": "",
  "id": "clear-score-task-handle;check-the-clear-score-calculator",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Test3"
    },
    {
      "line": 2,
      "name": "@Clearscore_Saving_Calculator"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I Navigate to webpage\"https://www.clearscore.com/savings-calculator\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I update current score to 50 and score goal to 680",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I check potential saving is 384",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.clearscore.com/savings-calculator",
      "offset": 22
    }
  ],
  "location": "TestStepOne.i_Navigate_to_webpage(String)"
});
formatter.result({
  "duration": 19929165724,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 26
    },
    {
      "val": "680",
      "offset": 47
    }
  ],
  "location": "TestStepOne.i_update_current_score_to_and_score_goal_to(int,int)"
});
formatter.result({
  "duration": 26108428152,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "384",
      "offset": 28
    }
  ],
  "location": "TestStepOne.i_check_potential_saving(int)"
});
formatter.result({
  "duration": 58805524,
  "status": "passed"
});
formatter.after({
  "duration": 248704,
  "status": "passed"
});
});