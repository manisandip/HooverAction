Feature:user should be able to hoover on category successfully
  @hoover
  Scenario: user should be able to perform hoover action
    #user can change any category on below line from home page
    When user hoover over category "Computers" link

    #user can change any subcategory from category listed above
    And click on subcategory "Notebooks" link
    Then user should be able to navigate to subcategory page "Notebooks" successfully