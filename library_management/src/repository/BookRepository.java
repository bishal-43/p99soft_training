package repository;

import model.Book;
import java.util.HashMap;
import java.util.Map;

public class BookRepository {
    private Map<Integer, Book> books = new HashMap<>();

    public void save(Book book){
        books.put(book.getId(),book);
    }


    public Book findById(int id) {
        return books.get(id);
    }
}
