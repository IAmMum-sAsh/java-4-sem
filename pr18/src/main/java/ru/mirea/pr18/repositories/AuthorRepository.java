package ru.mirea.pr18.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.pr18.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
}
