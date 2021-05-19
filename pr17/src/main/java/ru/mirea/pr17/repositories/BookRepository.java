package ru.mirea.pr17.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.pr17.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
