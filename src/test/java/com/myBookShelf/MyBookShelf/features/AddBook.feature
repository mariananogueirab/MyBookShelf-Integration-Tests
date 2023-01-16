@AddBook
Feature: Add book feature

  Scenario Outline: Add book
    When Add book with "<bookName>", "<isbn>", "<author>", "<imgUrl>", "<year>" and "<isRead>"
    Then I have the response with code "201"
    And I have the book information
    Examples:
      | bookName   | isbn      | author  | imgUrl                                                                                                                                | year | isRead |
      | dummy book | 1703-1994 | Mariana | https://media.istockphoto.com/id/1328887289/photo/happy-dog.jpg?b=1&s=170667a&w=0&k=20&c=mp3L73BC14QUuk1EQaYtZ1-wwJRW9HAffcsGZNyMy_o= | 2023 | yes    |

  Scenario Outline: Add an existent book
    When Add book with "<bookName>", "<isbn>", "<author>", "<imgUrl>", "<year>" and "<isRead>"
    And Add book with "<bookName>", "<isbn>", "<author>", "<imgUrl>", "<year>" and "<isRead>"
    Then I have the response with code "200"
    And I have the response for book already exists
    Examples:
      | bookName   | isbn      | author  | imgUrl                                                                                                                                | year | isRead |
      | dummy book | 1703-1994 | Mariana | https://media.istockphoto.com/id/1328887289/photo/happy-dog.jpg?b=1&s=170667a&w=0&k=20&c=mp3L73BC14QUuk1EQaYtZ1-wwJRW9HAffcsGZNyMy_o= | 2023 | yes    |
