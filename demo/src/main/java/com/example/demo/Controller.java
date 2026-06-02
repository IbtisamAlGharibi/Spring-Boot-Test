package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @GetMapping
    public String greeting (){
        return "Hi Ibtisam";
    }

    @GetMapping("Book/names")
    public List<String > books(){
        return Arrays.asList(
                "The Golden fish",
                "The secret garden",
                "Harry Potter"
        );
    }

    @GetMapping("book/data")
    public List<Book> bookData(){
        return Arrays.asList(
                new Book("The Golden fish","b1"),
                new Book("The secret garden","b2"),
                new Book("Harry Potter","b3")

                );
    }
}
