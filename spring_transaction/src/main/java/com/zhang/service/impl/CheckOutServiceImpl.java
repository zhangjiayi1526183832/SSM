package com.zhang.service.impl;

import com.zhang.service.BookService;
import com.zhang.service.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckOutServiceImpl implements CheckOutService {
    @Autowired
    private BookService bookService;

    @Override
//    @Transactional
    public void checkout(Integer userId,Integer[] bookIds) {
        for (Integer bookId : bookIds) {
            bookService.buybook(userId,bookId);
        }
    }
}
