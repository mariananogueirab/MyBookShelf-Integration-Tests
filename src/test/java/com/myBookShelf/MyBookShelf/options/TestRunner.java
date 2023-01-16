package com.myBookShelf.MyBookShelf.options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/mariana/Documentos/MyBookShelf-IntegrationTests/src/test/java/com/myBookShelf/MyBookShelf/features",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-html-report.html"
        },
        glue = {"com.myBookShelf.MyBookShelf"},
        monochrome = true,
        tags = "@AddBook"
)
public class TestRunner {
}
