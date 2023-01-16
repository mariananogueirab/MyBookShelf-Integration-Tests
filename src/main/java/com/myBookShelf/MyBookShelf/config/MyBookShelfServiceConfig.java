package com.myBookShelf.MyBookShelf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*@PropertySource({"database.properties", "sqlQuerys.properties"})*/
@ComponentScan(basePackages = {"com.myBookShelf.MyBookShelf"})
@Configuration
public class MyBookShelfServiceConfig {
}
