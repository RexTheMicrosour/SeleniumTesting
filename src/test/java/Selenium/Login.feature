Feature: LoginFeature

  Scenario: Create an account

    And I enter First name and Last Name
    And I enter Email and I enter confirm email
    And I enter password and I enter confirm password
    And I click the Terms and condition checkbox
    And I click the I Over 18 checkbox
    And I click the Code of Ethics and Conduct Checkbox
    And I click the login button
    Then I see the user created page






