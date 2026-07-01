public class AudioBook extends Book{
    double duration;

    public AudioBook(int id,String title, String author, String ISBN, double duration){
        super(id,title,author,ISBN);
        this.duration = duration;
    }

    public double getDuration{
        return duration;
    }

    public void setDuration(double duration){
        this.duration = duration;
    }


    @Override
    public void displayBookType(){
        System.out.println(title + "is an AudioBook");
    }
}