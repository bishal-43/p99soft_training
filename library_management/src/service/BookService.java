package service;

import model.Book;

// interface segregation only handle what is need or use

public interface BookService {
    void addBook(Book book);

    Book getBook(int id);
}
