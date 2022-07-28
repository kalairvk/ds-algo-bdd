Feature: ds-algo HomePage

  @tag
  Scenario: User lands on HomePage
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage
    And The user should see 7 panes with different data structures
    
    Scenario: User checks list of data structures
		Given The user opens HomePage 
    When The user clicks "Data Structures" drop down
    Then I should see 6 different data structure entries in that dropdown
    
    Scenario: User gets error when not logged in
    Given The user opens HomePage 
    When The user clicks any of the "Get Started" buttons below the data structures 
    Then It should alert the user with a message "You are not logged in"

  Scenario: User tries to Sign in
    Given The user opens HomePage 
    When The user clicks "Sign in" link
    Then The user should be redirected to Sign in page
  
   Scenario: User tries to Register
    Given The user opens HomePage 
    When The user clicks "Register" link
    Then The user should be redirected to Register form
