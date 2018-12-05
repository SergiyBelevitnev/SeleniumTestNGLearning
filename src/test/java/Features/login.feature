Feature: LoginFeature
  This feture deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for Login
      | username      | password          |
      | belevitnev    | 3109703178        |
      | belevitnevalv | 3109703178        |
      | belevitnevaov | 3109703178        |
      | belevitnev01  | belevitnevQwerty1 |
      | belevitnev02  | belevitnevQwerty1 |
      | belevitnev03  | belevitnevQwerty1 |

    And I click login button
    Then I should see the userform page