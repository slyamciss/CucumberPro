Feature: Register User Verification

@smoke
Scenario: Register User

Given user is on register page 
When user enters all the registration details
Then verify the user is registered
