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

  Scenario:  Go to Read More from Learn Selenium
          Given I am on Main Page
          When I click on Read More from Learn Selenium
          Then I will redirected to Fundamentals page

  Scenario:  Go to Main Page from Learn Selenium
    Given I am on Fundamentals page from Learn Selenium
    When I click on Return from Learn Selenium
    Then I will redirected to Main page

  Scenario: Go to Steve Smith FB
            Given I am on Instructors Page
            When I click on Steve Smith FB page
     Then I will redirected to FB page


Scenario: Go to "How do I sign up?" from Questions
  Given I am on Main Page
  When I click on the Questions Button
  And I click on "How do I sign up?"
  Then the answear will appear


  Scenario: Go to "Where is your institution located?" from Questions
    Given I am on Main Page
    When I click on the Questions Button
    And I click on "How do I sign up?"
    Then the answear will appear
