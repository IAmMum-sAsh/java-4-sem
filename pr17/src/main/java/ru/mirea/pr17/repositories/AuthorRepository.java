package ru.mirea.pr17.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.pr17.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
}
