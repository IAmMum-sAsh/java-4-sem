package ru.mirea.pr16.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.pr16.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
}
