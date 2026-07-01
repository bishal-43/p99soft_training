public class Student extends Member{
    private double PRN;

    public student(int memberId, String name, double PRN){
        super(memberId,name);
        this.PRN = PRN;
    }

    public double getPRN{
        return PRN;
    }

    public void setPRN(double PRN){
        this.PRN = PRN;
    }
}