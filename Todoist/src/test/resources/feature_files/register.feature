@register
Feature: Register an user
  I want to register me on Todoist website

  @succesfully
  Scenario Outline: Register an user successfully on Todoist website
    Given I want to register me with my name "<name>", email "<email>" and password "<password>"

    Examples: 
      | name         | email         | password    | status  |
      | Pepito Perez | abc@gmail.com | Pru3bas1234 | success |
