package ru.mirea.pr15.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.pr15.entity.Author;
import ru.mirea.pr15.entity.Book;
import ru.mirea.pr15.repositories.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    protected AuthorRepository authorRepository;

    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    public void addAuthor(Author newAuthor) {
        authorRepository.save(newAuthor);
    }

    public void deleteAuthor(Author deletedAuthor) {
        Author author = authorRepository.findById(deletedAuthor.getId()).orElseThrow(() -> new RuntimeException("Author not found"));
        authorRepository.delete(author);
    }
}
