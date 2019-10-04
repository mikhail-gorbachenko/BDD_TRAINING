Feature: Search On Ebay

  Scenario Outline: Running a Full Text Quick Search
    Given I set search request "<request>"
    When I perform search
    Then the term query "<request>" should be the first in the Search Result grid

    Examples:
    |request|
    |iPhone 4s|
    |Samsung Note 4|
