package model;

import java.time.LocalDate;

public class BorrowRecord {
    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowRecord(Book book,Member member){
        this.book = book;
        this.member = member;
        this.borrowDate = LocalDate.now();
    }

    public Book getBook(){
        return book;
    }

    public void setBook(Book book){
        this.book = book;
    }

    public Member getMember(){
        return member;
    }

    public void setMember(Member member){
        this.member = member;
    }

    public LocalDate getBorrowDate(){
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate){
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate(){
        return returnDate;
    }

    public void returnBook(LocalDate returnBook){
        this.returnDate = LocalDate.now();
    }
}
