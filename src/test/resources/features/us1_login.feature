Feature: TryCloud app login feature
  User Story:
  As a user, I should be able to log in.
  @login
  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    And user use username "<username>" and password "<password>"
    When user click the login button
    Then verify the user should be at the dashboard page
    Examples:
      | username | password    |
      | User2    | Userpass123 |
      | User32   | Userpass123 |
      | User62   | Userpass123 |
      | User92   | Userpass123 |