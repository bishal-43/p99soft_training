package service.implementation;

import model.Book;
import repository.BookRepository;
import service.BookService;

public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;  // this is Dependency inversion principle depends on interface

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book){
        bookRepository.save(book);
    }

    public Book getBook(int id){
        return bookRepository.findById(id);
    }
}
