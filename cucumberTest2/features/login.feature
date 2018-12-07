@Facebook
Feature: Testing the login feature of facebook

  Scenario Outline: To verify the login page
    Given User navigated to the login page
    When Entered "<username>" as username and "<password>" as password
    Then User "<validateLogin>" to home page
    Then close the browser

    Examples: 
      | username                    | password     | validateLogin |
      | sivapothireddy474@gmail.com | YWJoaV8xMjM= | shouldgo      |
      | xxx@gmail.com               | xxx          | shouldnot     |
      | sivapohireddy4432@gmail.com | kasdflaj     | shouldnot     |
