Feature: Login Page Fonctionality verification

Background: 
Given user launches browser and navigate to www.amazon.com
When user clicks on your amazon.com link


@regretion
Scenario: Login Page Verification
#Then user should be navigated to login page
#And user should see email,pw,edit box and login button
#And user closes the application

@regretion @smoke 
Scenario: Login Success Verification
When enters valid username "tester123@gmail.com" and paw "tester123" and click on sign on
Then verify user is logged in successfully
And user closes the application

@Parameterization
Scenario Outline: User Verification for Multiple Users 
When enters valid username "<username>" and paw "<Password>" and click on sign on
Then verify user is logged in successfully
And user closes the application
Examples:
|    username 	          |         Password     |
|  salesman123@gmail.com  |        sales123      |
|  director@gmail.com     |        director123   |
|  tester@gmail.com       |        tester589     |

@Inline
Scenario: Inline Table or Cucumber Tables 
When enters valid username "<username>" and paw "<Password>" and click on sign on
|    username 	          |         Password     |
|  salesman123@gmail.com  |        sales123      |
|  director@gmail.com     |        director123   |
|  tester@gmail.com       |        tester589     |
Then user closes the application


@star
Scenario: Star can be used to replace any keyword
  * enter your name
