package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    // 调用业务层接口
    @Autowired
    private BookService bookService;

    @PostMapping
    public boolean save(@RequestBody Book book) {
        return bookService.save(book);

    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
       return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable  Integer id) {
       return bookService.delete(id);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        return book;
    }

    @GetMapping
    public List<Book> getAll() {
        List<Book> books = bookService.getAll();
        return books;
    }
}
