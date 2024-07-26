Feature: Free Games feature functionality

  @sanity @smoke @regression
  Scenario: Verify User should navigate successfully on Free Games Page
    Given I am on Homepage
    And verify I am on Homepage
    When I accept all cookies
    Then I should click on Free Games
    And I should see the text Virgin Games Daily Free Games