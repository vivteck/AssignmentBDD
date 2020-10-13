Feature: Calculate operations on Homepage
         In order to do use the calculate operations on Homepage
         I have to enter the data in the calculator
  Background: nav to app
    Given I navigate to the url "https://testsheepnz.github.io/BasicCalculator.html"
    Then  i should navigate to the home page
    When  I enter first number as 20
    And   I enter second number as 30

  Scenario: Verify Add
    And   I select Add from the drop down
    And   I click on calculate
    Then  I should get the answer

Scenario: Verify Subtract
    And   I select Subtract from the drop down
    And   I click on calculate
    Then  I should get the answer


Scenario: Verify Multiply
    And   I select Multiple from the drop down
    And   I click on calculate
    Then  I should get the answer

Scenario: Verify Divide
    And   I select Divide from the drop down
    And   I click on calculate
    Then  I should get the answer


Scenario: Verify Concatenate
    And   I select Concatenate from the drop down
    And   I click on calculate
    Then  I should get the answer

