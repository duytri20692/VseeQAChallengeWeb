@VseeQAChallengeWeb
Feature: Send An Email

  @SendAnEmail
  Scenario: Send an email by using Gmail account
    Given User Login to Gmail page with Username and Password
    When User click on Compose button
    And User input the following info:
      | Fields  | Values                  |
      | To      | duytri20692@gmail.com   |
      | Subject | Testing email           |
      | Content | This is a testing email |
    And User click on Send button
    Then User should see the success message