package com.myBookShelf.MyBookShelf.model;

import lombok.Data;

@Data
public class BookRequest {
    public String bookName;
    public String isbn;
    public String author;
    public String imgUrl;
    public int year;
    public String isRead;
}
