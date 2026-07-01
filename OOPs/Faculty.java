public class Faculty extends Member{
    private String department;

    public faculty(int memberId, String name, String department){
        super(memberId,name);
        this.department = department;
    }

    public String getDepartment{
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }
}