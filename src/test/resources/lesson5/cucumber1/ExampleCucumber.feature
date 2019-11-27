Feature: Selenium Example Cucumber usage

  Scenario: Check login
    Given I open EPAM JDI Site
    When I login as user 'epam' with password '1234' on the Home page
    Then username should be 'PITER CHAILOVSKII' on the Home page

  Scenario: Fill contact form
    Given I open EPAM JDI Site
    And I login as user 'epam' with password '1234' on the Home page
    And I click 'CONTACT_FORM' link in the Left menu on the Home page
    When I set values to the Contact Form Page
      | name  | last_name   | position   |
      | name1 | last name 1 | position 1 |
    And I click 'Submit' button on the Contact Form page
    Then Contact Form page should have entered values

  Scenario: Fill contact form with data
    Given I open EPAM JDI Site
    And I login as user 'epam' with password '1234' on the Home page
    And I click 'contact_form' link on the Home page
    When I set data to the Contact Form Page
      | name  | last_name   | position   |
      | name1 | last name 1 | position 1 |
    And I click 'Submit' button on the Contact Form page
    Then Contact Form page should have entered data