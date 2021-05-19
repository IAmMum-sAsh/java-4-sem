package ru.mirea.pr16.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.pr16.entity.Author;
import ru.mirea.pr16.repositories.AuthorRepository;

import java.util.List;
import javax.transaction.Transactional;

@Service
public class AuthorService {
    @Autowired
    protected AuthorRepository authorRepository;

    @Transactional
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    public void addAuthor(Author newAuthor) {
        authorRepository.save(newAuthor);
    }

    @Transactional
    public void deleteAuthor(Author deletedAuthor) {
        Author author = authorRepository.findById(deletedAuthor.getId()).orElseThrow(() -> new RuntimeException("Author not found"));
        authorRepository.delete(author);
    }
}
