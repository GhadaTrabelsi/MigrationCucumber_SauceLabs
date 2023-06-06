@Frame
Feature: Switch Frame

  Scenario: Switching to a new frame and verifying the title of the new window
    Given I am on the homepage "http://demo.guru99.com/test/guru99home/"
    When I switch to the frame
    And I click on the image
    Then I switch to the new window
    And I verify the title of the new window is "Expected Title"
  
    
     