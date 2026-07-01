package service;

// interface segregation
public interface BorrowService {
    void borrowBook(int bookId, int memberId);

    void returnBook(int bookId, int memberId, int daysLate);

}
