Feature: FizzBuzz - game
  Return the correct text based on divisibility by 3, 5, or both.

  Scenario Outline: Check whether the number is divisible by 3, 5, or both
    Given the number <number>
    When I check if the number is divisible by 3 or 5 or both
    Then In response I should get <answer>
    Examples:
      | number | answer     |
      | 9      | "Fizz"     |
      | 10     | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 7      | "None"     |
      | 17     | "None"     |
      | 19     | "None"     |