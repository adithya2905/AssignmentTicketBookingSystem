$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Featurefiles/LondonTheaterTicketBooking.feature");
formatter.feature({
  "line": 1,
  "name": "Automating London Theater Website",
  "description": "",
  "id": "automating-london-theater-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9091430337,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify user able to book the ticket for particular movie",
  "description": "",
  "id": "automating-london-theater-website;verify-user-able-to-book-the-ticket-for-particular-movie",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launch the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "i am in HomePage find the search text and enter \"The Lion King\" in search and click on Booknow button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "select the date on which tickets available and select the seats",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter user and card details",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyTicketBookingSystem.LaunchingURL()"
});
formatter.result({
  "duration": 82467754,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The Lion King",
      "offset": 49
    }
  ],
  "location": "VerifyTicketBookingSystem.homepage(String)"
});
formatter.result({
  "duration": 5152826816,
  "status": "passed"
});
formatter.match({
  "location": "VerifyTicketBookingSystem.selectDate()"
});
formatter.result({
  "duration": 24685017430,
  "status": "passed"
});
formatter.match({
  "location": "VerifyTicketBookingSystem.UserDetails()"
});
formatter.result({
  "duration": 5258774110,
  "status": "passed"
});
formatter.after({
  "duration": 1113323509,
  "status": "passed"
});
});