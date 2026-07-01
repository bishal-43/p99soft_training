package service.implementation;

import model.Book;
import model.BorrowRecord;
import model.Member;
import notification.NotificationService;
import payment.PaymentService;
import repository.BookRepository;
import repository.BorrowRepository;
import repository.MemberRepository;

import service.BorrowService;
import service.FineCalculator;
import


public class BorrowServiceImpl implements BorrowService {
    private BookRepository bookRepository;
    private MemberRepository memberRepository;
    private BorrowRepository borrowRepository;
    private NotificationService notificationService;
    private FineCalculator fineCalculator;
    private PaymentService paymentService;

    public BorrowServiceImpl(        // dependency injection: depends on abstraction

            BookRepository bookRepository,
            MemberRepository memberRepository,
            BorrowRepository borrowRepository,
            NotificationService notificationService,
            FineCalculator fineCalculator,
            PaymentService paymentService
    ){
        this.bookRepository = bookRepository;
        this.memberRepository = memberRepository;
        this.borrowRepository = borrowRepository;
        this.notificationService = notificationService;
        this.fineCalculator = fineCalculator;
        this.paymentService = paymentService;
    }

    @Override
    public void borrowBook(int bookId, int memberId){
        Book book = bookRepository.findById(bookId);
        Member member = memberRepository.findById(memberId);

        if(book == null || member == null){
            throw new RuntimeException("Book or Member not found");

        }

        if(!book.isAvailable()){
            throw new RuntimeException("Book not available");
        }

        book.setAvailable(false);

        BorrowRecord record = new BorrowRecord(book,member);

        borrowRepository.save(record);

        notificationService.sendNotification("book borrowed successfully",member.getEmail());
    };


    @Override
    public void returnBook(int bookId, int memberId,int daysLate){
        Book book = bookRepository.findById(bookId);

        Member member = memberRepository.findById(memberId);

        if(book == null || member == null){
            throw new RuntimeException("Invalid data");

        }

        book.setAvailable(true);

        double fine = fineCalculator.calculateFine(daysLate);

        paymentService.pay(fine);

        notificationService.sendNotification("Book returned successfully. Fine: " + fine, member.getEmail());
    }
}
