package ru.mirea.pr16.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.mirea.pr16.entity.Book;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {
    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected String birthDate;
    protected List<Book> books;
}
