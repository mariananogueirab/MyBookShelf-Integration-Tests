package com.myBookShelf.MyBookShelf.client;

import com.myBookShelf.MyBookShelf.model.BookRequest;
import io.restassured.response.Response;

public interface MyBookShelfConfigService {
    Response addBook(BookRequest book);
}
