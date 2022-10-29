package com.example.sitecommerce.controller;

import com.example.sitecommerce.model.Book;
import com.example.sitecommerce.respository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;
    public List<Book>GetBook(){
        return BookRepository.findAll();
    }

}
