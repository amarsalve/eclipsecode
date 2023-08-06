Feature:Test Facebook Register Page

Scenario Outline:Test facebook register page
Given user is on register page
When user enter valid "<firstname>"and"<lastname>"and"<emailid>"


 Then user is on home page
 
 Examples:
 |firstname|lastname|emailid|
 |Anjali|More|anjali@tcs.com|
 |Sadhna|Patil|sadhna@tech.com|
 |Amol|Pande|amol@infosys.com|