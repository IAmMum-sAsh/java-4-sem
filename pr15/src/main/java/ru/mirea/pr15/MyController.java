package ru.mirea.pr15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.mirea.pr15.entity.Author;
import ru.mirea.pr15.entity.Book;
import ru.mirea.pr15.services.AuthorService;
import ru.mirea.pr15.services.BookService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;


    @RequestMapping(value = "/home")
    public String getHtmlPage() {
        return "index.html";
    }

    @RequestMapping(value = "/home/add_author", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Author> addAuthor(@RequestBody Author newAuthor) {
        Author author = new Author(newAuthor.getFirstName(), newAuthor.getLastName(), newAuthor.getMiddleName(), newAuthor.getBirthDate());
        authorService.addAuthor(author);
        return ResponseEntity.ok(author);
    }

    @RequestMapping(value = "/home/add_book", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Book> addBook(@RequestBody Book newBook) {
        Book book = new Book(newBook.getName(), newBook.getCreationDate());
        bookService.addBook(book);
        return ResponseEntity.ok(book);
    }

    @RequestMapping(value = "/home/delete_author", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Author> deleteAuthor(@RequestBody Author deletedAuthor) {
        authorService.deleteAuthor(deletedAuthor);
        return ResponseEntity.ok(deletedAuthor);
    }

    @RequestMapping(value = "/home/delete_book", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Book> deleteBook(@RequestBody Book deletedBook) {
        bookService.deleteBook(deletedBook);
        return ResponseEntity.ok(deletedBook);
    }

    @RequestMapping(value = "/home/get_authors", method = RequestMethod.GET)
    public ResponseEntity<List<Author>> getAuthors() {
        List<Author> list = new ArrayList<>(authorService.getAuthors());
        return new ResponseEntity<List<Author>> (list, HttpStatus.OK);
    }

    @RequestMapping(value = "/home/get_books", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> list = new ArrayList<>(bookService.getBooks());
        return new ResponseEntity<List<Book>> (list, HttpStatus.OK);
    }
}
