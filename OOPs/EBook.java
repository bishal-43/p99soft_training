public class EBook extends Book{
    private double filesize;

    public EBook(int id, String title, String author, String ISBN, double filesize){
        super(id,title,author,ISBN);
        this.filesize = filesize;
    }

    public double getFilesize{
        return filesize;
    }

    public void setFilesize(double filesize){
        this.filesize = filesize;
    }


    public void displayBookType(){
        System.out.println(title + "is a EBook");
    }
}