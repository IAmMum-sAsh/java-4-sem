package ru.mirea.pr18.repositories;

import org.springframework.stereotype.Repository;
import ru.mirea.pr18.entity.Book;

import java.util.List;

@Repository
public interface BookFilterRepository{
    List<Book> findByAuthor_idAndNameAndCreationDate(
            Long author_id, String name, String creationDate
    );
}
