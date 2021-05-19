package ru.mirea.pr17.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookToAuthorDto {
    protected String name;
    protected String creationDate;
    protected long authorId;
}
