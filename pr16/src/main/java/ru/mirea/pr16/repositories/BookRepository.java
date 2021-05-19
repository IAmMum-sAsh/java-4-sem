package ru.mirea.pr16.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.pr16.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
