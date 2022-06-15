Feature: Calculator

  Scenario Outline: Calculator Functionality
    When I want count <angka1> and <angka2>
    And I using operator "<operator>"
    Then I receive <hasil> from this count
    Examples:
      | angka1 | angka2 | operator | hasil |
      | 10     | 5      | +        | 15    |
      | 90     | 10     | -        | 80    |
      | 15     | 3      | *        | 5     |