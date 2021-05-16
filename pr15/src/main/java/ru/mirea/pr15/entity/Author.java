package ru.mirea.pr15.entity;

import lombok.*;

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

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", id=" + id +
                '}';
    }
}
