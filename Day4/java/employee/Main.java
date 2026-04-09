package Day4.java.employee;

import java.util.Scanner;
import Day4.java.employee.EmployeeManager;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        EmployeeManager manager = new EmployeeManager();
        
        int choice;

        do{
            System.out.println("\n1. Add employee");
            System.out.println("2. view employee");
            System.out.println("3. Remove employee");
            System.out.println("4. exit");
            System.out.println("enter choice");

            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    manager.addEmployee(
                        new Employee(id, name, salary)
                    );
                    break;

                case 2:
                    manager.viewEmployee();
                    break;

                case 3:
                    System.out.print("Enter ID to remove: ");
                    int removeId = scanner.nextInt();
                    manager.deleteEmployee(removeId);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice!=4);

    scanner.close();
}
}
