// Main.java
public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        // Books
        Ebook ebook = new Ebook(1, "Java Basics", "James", "ISBN101", 5.6);
        AudioBook audioBook = new AudioBook(2, "OOP Concepts", "Robert", "ISBN102", 120);
        PhysicalBook physicalBook = new PhysicalBook(3, "Data Structures", "Mark", "ISBN103", 12);

        // Members
        Faculty faculty = new Faculty(101, "John", "Computer Science");

        // Add to library
        library.addBook(ebook);
        library.addBook(audioBook);
        library.addBook(physicalBook);

        library.addMember(faculty);

        // Borrow book
        faculty.borrow(physicalBook);

        // Return book
        faculty.returnBook(physicalBook);

        // Search
        library.searchByTitle("Java Basics");
        library.searchByAuthor("Mark");
    }
}