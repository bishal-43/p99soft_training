public class Library{
    private List<Book> books;
    private List<Member> members;

    public library{
        books = new ArrayList<>();
        members = new ArrayList<>();

    }

    public void addBook(Book book){
        books.add(book);
        System.out.println(book + "added to library");
    }

    public void addMember(Member member){
        members.add(member);
        System.out.println(member.getname() + "added to library");`
    }

    public void searchByTitle(String Title){
        for(Book book:books){
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println(book.getTitle() + "is found");
            }
        }
    }

    public void searchByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Book Found: " + book.getTitle());
            }
        }
    }

    // Display all books
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }

}