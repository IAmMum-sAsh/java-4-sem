package ru.mirea.pr16.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "authors")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Author extends BaseEntity{
    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected String birthDate;
    @OneToMany(mappedBy = "author_id", fetch = FetchType.LAZY)
    protected List<Book> books;

    public Author(String firstName, String lastName, String middleName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.books = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", books=" + books +
                ", id=" + id +
                '}';
    }
}
