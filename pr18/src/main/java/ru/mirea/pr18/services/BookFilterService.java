package ru.mirea.pr18.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mirea.pr18.entity.Book;
import ru.mirea.pr18.repositories.BookFilterRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookFilterService implements BookFilterRepository{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Book> findByAuthor_idAndNameAndCreationDate(Long author_id, String name, String creationDate) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> bookCriteriaQuery = criteriaBuilder.createQuery(Book.class);
        Root<Book> bookRoot = bookCriteriaQuery.from(Book.class);

        ArrayList<Predicate> predicates = new ArrayList<>();

        if(author_id != null){
            predicates.add(criteriaBuilder.equal(bookRoot.get("author_id"),  author_id));
        }
        if(name != null){
            predicates.add(criteriaBuilder.equal(bookRoot.get("name"),  name));
        }
        if(creationDate != null){
            predicates.add(criteriaBuilder.equal(bookRoot.get("creationDate"),  creationDate));
        }
        bookCriteriaQuery.where(predicates.toArray(new Predicate[0]));

        return entityManager.createQuery(bookCriteriaQuery).getResultList();
    }
}
