Feature: Language selection function at Amazon website
  User Story: User should be able to select language espaniol from homepage.

  @wip
  Scenario: Select espaniol
    Given user is one the Amazon main page
    When user however a language selection module
    And users clicks espaniol button
    Then user sees the "Hola, Identifícate" text
