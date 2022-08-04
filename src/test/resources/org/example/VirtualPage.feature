Feature: Virtual Page

  These tests will verify functionality of the

  Scenario: Return to Main Page from Virtual Page
    Given  I am on Virtual Page
    When I click on return button
    Then I will be redirected to the Main Page