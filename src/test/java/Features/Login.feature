#Author:Pankaj Shrivastava
Feature: Login to the application "Prestashop".

  Scenario: Navigate to Prestashop website.
    Given login to the prestashop
    When Wait for the Cookie Pop
    And handle teh Cookie Pop
    Then user landed to home Page

#    Examples:
#      | Options     |
#      | I refuse    |
#      | I choose    |
#      | Fine for me |