package ru.mirea.pr14;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book implements BaseClass{
    @JsonProperty("name")
    public String name;
    @JsonProperty("creationDate")
    public String creationDate;

    public Book() {}

    public Book(String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", creationDate='" + creationDate + '\'' +
                '}';
    }
}
