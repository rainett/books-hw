package com.rainett.bookshwmate.repository;

import com.rainett.bookshwmate.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
