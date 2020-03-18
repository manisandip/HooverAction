Feature:user should be able to hoover on category successfully
  @hoover
  Scenario: user should be able to perform hoover action
    When user hoover over category "Computers" link
    And click on subcategory "Notebooks" link
    Then user should be able to navigate to subcategory page "Notebooks" successfully