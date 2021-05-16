package ru.mirea.pr15.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.pr15.entity.Book;
import ru.mirea.pr15.repositories.BookRepository;

import java.util.List;

@Service
public class BookService {
    @Autowired
    protected BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public void addBook(Book newBook) {
        bookRepository.save(newBook);
    }

    public void deleteBook(Book deletedBook) {
        Book book = bookRepository.findById(deletedBook.getId()).orElseThrow(() -> new RuntimeException("Book not found"));
        bookRepository.delete(book);
    }
}
