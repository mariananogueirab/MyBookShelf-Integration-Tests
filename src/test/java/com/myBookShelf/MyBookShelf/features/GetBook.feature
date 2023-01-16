Feature: Get Book feature

  Scenario Outline: Get book by id
    When Get book by id with the "<id>"
    Then I have the response with code "200"
    And I have the book information
    Examples:
      | id                     |
      | 978-0-439-78596-9-2005 |
      | 978-1-4088-5565-2-1997 |
      | 978-1-4555-4604-6-2014 |
      | 978-65-5921-083-1-2021 |

  Scenario Outline: Get book by author name
    When Get book by author name with the "<author name>"
    Then I have the response with code "200"
    And I have a list with the books information
    Examples:
      | author name          |
      | J. K. Rowling        |
      | Lois P. Frankel, PhD |
      | Gabriela Prioli      |

  Scenario: Get all books
    When Get all the books
    Then I have the response with code "200"
    And I have a list with the books information

  Scenario: Get an nonexistent book by id
    When Get book by id with the "978-333"
    Then I have the response with code "404"

  Scenario: Get an nonexistent book by author name
    When Get book by author name with the "Marilia Mendonça"
    Then I have the response with code "404"