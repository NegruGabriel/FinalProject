Feature: Main Page

  These tests will verify functionality of the

  Scenario: Click on the Instructors
    Given I am on Main Page
    When I click on Instructors
    Then Our instructors header should appear

  Scenario: Enter on the Sign up Page
    Given I am on Main Page
    When I click on Start the Enrollment
    Then I am redirected on the Sign Up Page

    Scenario:
      Given
      When
      Then
