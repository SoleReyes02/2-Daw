package sberenguer.prueba_libros.domain.entity;

import java.util.List;

public class Book {
    int id;
    String title;
    int year;
    List<Character>characterList;
    Author author;

    public Book() {
    }

    public Book(int id) {
        this.id = id;
    }

    public Book(int id, String title, int year,Author author) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public Book(int id, String title, int year, List<Character> characterList, Author author) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.characterList = characterList;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
