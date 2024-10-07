package com.rainett.bookshwmate.service;

import com.rainett.bookshwmate.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
