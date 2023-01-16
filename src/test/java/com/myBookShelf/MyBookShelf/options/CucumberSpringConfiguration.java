package com.myBookShelf.MyBookShelf.options;

import com.myBookShelf.MyBookShelf.config.MyBookShelfServiceConfig;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = MyBookShelfServiceConfig.class)
public class CucumberSpringConfiguration {
}
