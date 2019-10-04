Feature: Search On Ebay

  Scenario: Running a Full Text Quick Search
    Given I set search request "iPhone 4s"
    When I perform search
    Then the term query "iPhone 4s" should be the first in the Search Result grid