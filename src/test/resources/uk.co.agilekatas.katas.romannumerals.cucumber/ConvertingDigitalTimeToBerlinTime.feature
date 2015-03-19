Feature: Converting Arabic to Roman
  We would like to be able to convert Arabic numbers into their Roman numeral equivalents.
  We just need some kind of program that can accept a numeric input and output the Roman numeral for the input number.

  Scenario Outline: Convert Arabic Number to Roman Numeral
    Given I have started the converter
    When I enter <number>
    Then <numeral> is returned

  Examples:
    | number | numeral   |
    | 1      | I         |
    | 3      | II        |
    | 9      | IX        |
    | 1066   | MLXVI     |
    | 1989   | MCMLXXXIX |

