package Day4.java.employee;

import java.util.ArrayList;

public class EmployeeManager {
    ArrayList<Employee> employees = new ArrayList<>();

    // add employees to arraylist
    void addEmployee(Employee emp){
        employees.add(emp);
        System.out.println("Employees added");
    }

    void viewEmployee(){
        if(employees.isEmpty()){
            return;
        }

        for(Employee emp:employees){
            emp.display();
        }
    }

    void deleteEmployee(int id){
        for(Employee emp:employees){
            if(emp.getId() == id){
                employees.remove(emp);
                System.out.println("Employees deleted");
                return;
            }
        }
        System.out.println("Employee not found");
    }
}
