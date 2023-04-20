Feature: User Registeration
       i want to check user can register in e-commerce website
       
Scenario Outline: User Registeration
Given The user in home page 
When i click on register link 
And i entered data user "<firstname>" "<lastname>" "<email>" "<password>"
Then the page of registeration displayed successfuly

Examples:
| firstname | lastname | email | password |
| ahmed | abpkhadra | ahmed999@test | 47854 |
| ali | saeed | ali9999@gmail.com | 9845714 |