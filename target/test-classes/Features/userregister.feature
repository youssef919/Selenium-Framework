Feature: User Registeration
       i want to check user can register in e-commerce website
       
Scenario Outline: User Registeration
Given The user in home page 
When i click on register link 
And i entered data user "<firstname>" "<lastname>" "<email>" "<password>"
Then the page of registeration displayed successfuly

Examples:
| firstname | lastname | email | password |
| ahmedd | abpkhadraa | ahmed9959@test | 478554 |
| alii | saeedd | ali99899@gmail.com | 98455714 |