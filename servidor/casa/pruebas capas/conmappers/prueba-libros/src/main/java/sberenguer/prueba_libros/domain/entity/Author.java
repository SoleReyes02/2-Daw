package sberenguer.prueba_libros.domain.entity;

import java.util.List;

public class Author {
    int id;
    String name;
    private List<Book>bookList;

    public Author() {
    }

    public Author(int id) {
        this.id = id;
    }

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }


}
