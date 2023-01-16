package com.myBookShelf.MyBookShelf.steps;


import com.myBookShelf.MyBookShelf.model.BookRequest;
import com.myBookShelf.MyBookShelf.options.AbstractServiceTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static org.springframework.http.HttpStatus.CREATED;

public class stepsDefinition extends AbstractServiceTest {

    BookRequest bookRequest = new BookRequest();
    Response response;

    @When("Get book by id with the \"(.*)\"$")
    public void getBookById(String id) {

    }
    
    @Then("I have the response with code \"(.*)\"$")
    public void iHaveTheResponseCode(int code) {
        if (code == CREATED.value()) {
            response.then().statusCode(code);
        }
    }

    @And("I have the book information")
    public void iHaveTheBookInformation() {

    }

    @When("Get book by author name with the \"(.*)\"$")
    public void getBookByAuthorName(String authorName) {
    }

    @And("I have a list with the books information")
    public void iHaveAListWithTheBooksInformation() {
        
    }

    @When("Get all the books")
    public void getAllTheBooks() {

    }

    @When("Add book with {string}, {string}, {string}, {string}, {string} and {string}")
    public void addBook(String bookName, String isbn, String author, String imgUrl, String year, String isRead) {
        bookRequest.setBookName(bookName);
        bookRequest.setIsbn(isbn);
        bookRequest.setAuthor(author);
        bookRequest.setImgUrl(imgUrl);
        bookRequest.setYear(Integer.parseInt(year));
        bookRequest.setIsRead(isRead);

        response = myBookShelfConfigService.addBook(bookRequest);
    }

    @And("I have the response for book already exists")
    public void iHaveTheResponseForBookAlreadyExists() {
    }

    @When("Delete the book by id")
    public void deleteTheBookById() {

    }

    @And("I have the message {string}")
    public void iHaveTheMessage(String arg0) {
    }

    @When("Delete the book with an nonexistent id {string}")
    public void deleteTheBookWithAnNonexistentId(String arg0) {
    }

}
