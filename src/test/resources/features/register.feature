Feature: ds-algo RegisterPage

  @tag
  Scenario: User lands on RegisterPage
    Given The user opens Register Page
    When The user clicks "Register" button with all fields empty
    Then It should display an error "Please fill out this field" below Username textbox
    