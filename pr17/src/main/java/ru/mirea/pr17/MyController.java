package ru.mirea.pr17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.mirea.pr17.dto.AuthorDto;
import ru.mirea.pr17.dto.BookToAuthorDto;
import ru.mirea.pr17.entity.Author;
import ru.mirea.pr17.entity.Book;
import ru.mirea.pr17.services.AuthorService;
import ru.mirea.pr17.services.BookFilterService;
import ru.mirea.pr17.services.BookService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    @Autowired
    private BookFilterService bookFilterService;


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
    public ResponseEntity<Book> addBook(@RequestBody BookToAuthorDto request) {
        Book book = new Book(request.getName(), request.getCreationDate());
        bookService.addBook(book, request.getAuthorId());
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

    @Transactional
    @RequestMapping(value = "/home/get_authors", method = RequestMethod.GET)
    public ResponseEntity<List<AuthorDto>> getAuthors() {
        List<Author> list = authorService.getAuthors();
        List<AuthorDto> dtoList = new ArrayList<>();
        for(Author author : list){
            dtoList.add(new AuthorDto(author.getFirstName(), author.getLastName(), author.getMiddleName(), author.getBirthDate(), author.getBooks().subList(0, author.getBooks().size())));

        }
        return ResponseEntity.ok(dtoList);
    }

    @RequestMapping(value = "/home/get_books", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> list = new ArrayList<>(bookService.getBooks());
        return new ResponseEntity<List<Book>> (list, HttpStatus.OK);
    }

    @RequestMapping(value = "home/filter", method = RequestMethod.POST)
    @ResponseBody
    public List<Book> filter(@RequestBody() Book book){
        return bookFilterService.findByAuthor_idAndNameAndCreationDate(
                book.getAuthor_id(), book.getName(), book.getCreationDate());
    }
}
