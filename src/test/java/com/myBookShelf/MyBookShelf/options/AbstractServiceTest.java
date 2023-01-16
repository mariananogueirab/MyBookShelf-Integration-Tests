package com.myBookShelf.MyBookShelf.options;


import com.myBookShelf.MyBookShelf.client.MyBookShelfConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AbstractServiceTest {

    @Autowired
    public MyBookShelfConfigService myBookShelfConfigService;

}
