Feature: Delete book

  Scenario Outline: Delete book by id
    When Add book with "<bookName>", "<isbn>", "<author>", "<imgUrl>", "<year>" and "<isRead>"
    Then I have the response with code "201"
    When Delete the book by id
    Then I have the response with code "201"
    And I have the message "Book deleted"
    Examples:
      | bookName   | isbn      | author  | imgUrl                                                                                                                                | year | isRead |
      | dummy book | 1703-1994 | Mariana | https://media.istockphoto.com/id/1328887289/photo/happy-dog.jpg?b=1&s=170667a&w=0&k=20&c=mp3L73BC14QUuk1EQaYtZ1-wwJRW9HAffcsGZNyMy_o= | 2023 | yes    |

  Scenario: Delete nonexistent book
    When Delete the book with an nonexistent id "978-333"
    Then I have the response with code "404"