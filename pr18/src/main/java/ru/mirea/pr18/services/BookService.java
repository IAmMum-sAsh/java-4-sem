package ru.mirea.pr18.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.pr18.entity.Author;
import ru.mirea.pr18.entity.Book;
import ru.mirea.pr18.repositories.AuthorRepository;
import ru.mirea.pr18.repositories.BookRepository;

import java.util.List;
import javax.transaction.Transactional;

@Service
@Slf4j
public class BookService {
    @Autowired
    protected BookRepository bookRepository;
    @Autowired
    protected AuthorRepository authorRepository;

    @Transactional
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public void addBook(Book newBook, long authorId) {
        Author author = authorRepository.findById(authorId).orElseThrow(() -> new RuntimeException("Author not found"));
        System.out.println(author.getId() + "\n" + newBook.getId());
        log.info("Х!УЯК");
//        List<Book> books = author.getBooks();
//        books.add(newBook);
//        author.setBooks(books);
        newBook.setAuthor_id(author.getId());
        bookRepository.save(newBook);
    }

    @Transactional
    public void deleteBook(Book deletedBook) {
        Book book = bookRepository.findById(deletedBook.getId()).orElseThrow(() -> new RuntimeException("Book not found"));
        bookRepository.delete(book);
    }
}
