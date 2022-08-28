package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    // 使用BookDao 接口 setter注入BookDao 调用booldao 方法
    // Spring 没有配bookDao的bean 这里使用的是自动代理模式
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        Book book = bookDao.getById(id);
        return book;
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = bookDao.getAll();
        return books;
    }
}
