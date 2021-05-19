package ru.mirea.pr16.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book extends BaseEntity{
    protected String name;
    protected String creationDate;
//    @JoinColumn(name="author", insertable = false, updatable = false)
//    @ManyToOne
//    @JsonIgnore
    protected long author_id;

    public Book(String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }
}
