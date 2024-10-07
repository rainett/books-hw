package com.rainett.bookshwmate.service.impl;

import com.rainett.bookshwmate.model.Book;
import com.rainett.bookshwmate.repository.BookRepository;
import com.rainett.bookshwmate.service.BookService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
