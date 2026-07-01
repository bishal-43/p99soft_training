public abstract class Book implements Borrowable{
    // private encapsulation
    private int id;
    private String title;
    private String author;
    private String ISBN;
    private boolean status;

    // constructor
    public Book(int id, String title, String author, String ISBN) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.status = true;
    }

    // getter and setter
    public int getId{
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle{
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor{
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getISBN{
        return ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public boolean isAvailable{
        return isAvailable;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }


    public void borrowBook(){
        if(available){
            available = false;
            System.out.println("You have borrowed the book: " + title);
        }else{
            System.out.println("Book is not available");
        }
    }

    public void returnBook(){
        available = true;
        System.out.println(title + "returned to library")
    }

    public abstract void displayBookType();
}