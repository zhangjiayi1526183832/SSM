package com.zhang.service.impl;

import com.zhang.dao.BookDao;
import com.zhang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
//    @Transactional
    public void buybook(Integer userId, Integer bookId) {
        //查询图书价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书库存
        bookDao.updateStock(bookId);
        //更新用户余额
        bookDao.updateBalance(userId,price);
    }
}
