package Day4.java.employee;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("id:"+id);
        System.out.println("name"+name);
        System.out.println("salary"+salary);

    }

    public int getId(){
        return id;
    }
}
