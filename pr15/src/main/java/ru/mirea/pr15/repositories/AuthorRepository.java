package ru.mirea.pr15.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.pr15.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
}
