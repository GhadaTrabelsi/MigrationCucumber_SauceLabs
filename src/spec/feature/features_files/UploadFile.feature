@File
Feature: File Upload Demo

  Scenario: Uploading a file and verifying the checkbox selection
    Given I am on the upload page "https://demo.guru99.com/test/upload/"
    When I upload the file "C:\Users\user\Desktop\Formation\Formation Selenium ZD HA\Data\Test.txt"
    And I select the checkbox
    Then I verify the checkbox is selected
    And I click the submit button
