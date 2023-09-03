
Feature: Book Store Functionality

  Scenario: Verify book search functionality
  When User searches for a book by title or author
  Then Relevant books should be displayed in the search results

  Scenario: Verify book details page
  When User selects a book from the list
   Then Book details page should be displayed

  Scenario: Verify adding a book to collection
  	When User selects a book from the list
    And User adds the book to the collection
    Then Book should be added to the collection successfully