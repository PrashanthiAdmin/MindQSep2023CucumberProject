#author: prashanthi
Feature: Login Page functionalities will be covered in this feature

@validlogin @regression
Scenario: Customer should be able to login to the application

#Given User is in login page
When User enters email id "mindqselenium6@gmail.com"
And User enters password "Test@123"
And User clicks sign in button
Then User should be able to login to the application

@invalidlogin
Scenario Outline: Customer should not be able to login with invalid credentials

#Given User is in login page
When User enters email id "<Emailid>"
And User enters password "<Password>"
And User clicks sign in button
Then User should see the error message on the login screen

Examples:
|Emailid|Password|
|test7896@gmail.com|Test123|
|test3456@gmail.com|Test123|


Scenario: Customer should login to the application using excel data

When User enters email and password and user should login to the application
