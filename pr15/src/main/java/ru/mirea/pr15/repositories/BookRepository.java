package ru.mirea.pr15.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.pr15.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
