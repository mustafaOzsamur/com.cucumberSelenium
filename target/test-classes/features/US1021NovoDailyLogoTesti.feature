Feature: US1021 homepage logo test on novodaily website

  Scenario: TC26 The user should be able to return to the homepage when clicking on the NOVODAILY logo

    Given Go to the "ndUrl" NovoDaily website.

    Then wait for the homepage to load for 5 seconds.

    And  Click on the "NOVODAILY" font logo.

    And  Verify that the NovoDaily logo is displayed on the homepage.

    Then close the browser
