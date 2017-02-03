@Test
Feature: Test

#  @Test-1
#  Scenario: User verify the page
#    Given the application is open
#    Then user can view the current time
#    And user can view the current day
#    And user can view the current date

  @Test-2
  Scenario: User can set the Alaram
    Given user is on the home page and Set the Alarm
    Then user can click on the Alarm symbol
    And user clicks on plus sign
    Then user sets alarm
    Then user clicks on Done
