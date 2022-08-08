Feature: Main Page

  These tests will verify functionality of the Software testing course


  Scenario: Click on the Instructors
    Given I am on Main Page
    When I click on Instructors
    Then Our instructors header should appear

  Scenario: Enter on the Sign up Page
    Given I am on Main Page
    When I click on Start the Enrollment
    Then I am redirected on the Sign Up Page

    Scenario: Sign Up with a valid email
    Given I am on Main Page
    When I enter a valid mail
    And  click on Submit
    Then a confirmation message appears

  Scenario: Sign Up with an invalid email
    Given I am on Main Page
    When I enter an invalid mail
    And  click on Submit
    Then a red border will be shown

  Scenario: Go to the In Person Page
    Given I am on Main Page
    When I click on the Read More button from the In Person section
    Then I will be redirected to the In Person Page

  Scenario: Go to the Hybrid Page
    Given I am on Main Page
    When I click on the Read More button from the Hybrid section
    Then I will be redirected to the Hybrid Page

  Scenario: Go to the Virtual Page
    Given I am on Main Page
    When I click on the Read More button from the Virtual section
    Then I will be redirected to the Virtual Page

  Scenario:  Go to Read More from Learn Selenium page
    Given I am on Main Page
    When I click on the Read More from Learn Selenium
    Then I will redirected to Fundamentals page

  Scenario: Go to "How do I sign up?" from Questions
    Given I am on Main Page
    When I click on the Questions Button
    And I click on "How do I sign up?"
    Then the Sign Up answer will appear

  Scenario: Go to "Where is your institution located?" from Questions
    Given I am on Main Page
    When I click on the Questions Button
    And I click on "Where is your institution located?"
    Then the institution answer will appear

  Scenario: Go to John Doe Twitter page
    Given I am on Main Page
    When I click on Instructors
    And I click on John Doe Twitter page
    Then I will redirected to Twitter page

  Scenario: Go to Jane Doe LinkedIn page
    Given I am on Main Page
    When I click on Instructors
    And I click on Jane Doe LinkedIn page
    Then I will redirected to LinkedIn page

  Scenario: Go to Sara Smith Instagram page
    Given I am on Main Page
    When I click on Instructors
    And I click on Sara Smith Instagram page
    Then I will redirected to Instagram page

  Scenario: Go to Steve Smith FB page
    Given I am on Main Page
    When I click on Instructors
    And I click on Steve Smith FB page
    Then I will redirected to FB page