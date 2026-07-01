import model.Book;
import model.Member;
import notification.EmailNotificationService;
import notification.NotificationService;
import payment.CreditCardPaymentService;
import payment.PaymentService;
import repository.BookRepository;
import repository.BorrowRepository;
import repository.MemberRepository;
import service.BookService;
import service.BorrowService;
import service.FineCalculator;
import service.MemberService;
import service.implementation.BookServiceImpl;
import service.implementation.BorrowServiceImpl;
import service.implementation.MemberServiceImpl;
import service.implementation.StandardFineCalculator;


public class Main {

    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepository();
        MemberRepository memberRepository = new MemberRepository();
        BorrowRepository borrowRepository = new BorrowRepository();


        // this is Liskov subtitution principle as later we can add SMSNotificationService
        // BorrowService will run without error
        NotificationService notificationService =new EmailNotificationService();

        FineCalculator fineCalculator = new StandardFineCalculator();
        BookService bookService = new BookServiceImpl(bookRepository);

        MemberService memberService = new MemberServiceImpl(memberRepository);

        PaymentService paymentService = new CreditCardPaymentService();

        BorrowService borrowService = new BorrowServiceImpl(
                        bookRepository,
                        memberRepository,
                        borrowRepository,
                        notificationService,
                        fineCalculator,
                        paymentService

        );


        Book book1 = new Book(101, "Clean Code", "Robert Martin", true);
        Member member1 = new Member(101, "Bishal", "bishal@gmail.com");

        bookService.addBook(book1);

        memberService.addMember(member1);

        borrowService.borrowBook(101, 101);

        borrowService.returnBook(101, 101, 5);
    }
}