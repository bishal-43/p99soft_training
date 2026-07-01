public class PhysicalBook extends Book{

    private int shelfnum;

    public physicalBook(int id, String title, String author, String ISBN,int shelfnum){
        super(id,title,author, ISBN);
        this.shelfnum = shelfnum;
    }

    public int getShelfnum{
        return shelfnum;
    }

    public void setShelfnum(int shelfnum){
        this.shelfnum = shelfnum;
    }



    public void displayBookType(){
        Sytem.out.println(title + "is in shelf number" + shelfnum);
    }
}