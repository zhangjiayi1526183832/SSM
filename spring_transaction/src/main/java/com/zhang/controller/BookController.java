package com.zhang.controller;

import com.zhang.service.BookService;
import com.zhang.service.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    private CheckOutService checkOutService;

    public void buybook(Integer userId,Integer bookId){
        bookService.buybook(userId,bookId);
    }

    public void checkout(Integer userId,Integer[] bookIds){
        checkOutService.checkout(userId,bookIds);
    }
}
