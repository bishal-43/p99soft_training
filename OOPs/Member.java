public class Member{

    private int memberId;
    private String name;

    public member(int memberId, String name){
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId{
        return memberId;
    }

    public void setMemberId(int memberId){
        this.memberId = memberId;
    }

    public String getName{
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void borrow(Book book){
        book.borrowBook();
    }

    public void return(Book book){
        book.returnBook();
    }
}