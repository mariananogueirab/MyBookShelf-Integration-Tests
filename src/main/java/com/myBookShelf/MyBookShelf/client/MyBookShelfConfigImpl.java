package com.myBookShelf.MyBookShelf.client;

import com.myBookShelf.MyBookShelf.model.BookRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.springframework.stereotype.Service;

import static io.restassured.RestAssured.given;

@Service
public class MyBookShelfConfigImpl implements MyBookShelfConfigService {

    public static final String ADD_BOOK_URI = "http://localhost:8080/book";

    @Override
    public Response addBook(BookRequest book) {
        return given().contentType(ContentType.JSON)
                .and().body(book).when().post(ADD_BOOK_URI).then().extract().response();
    }
}
