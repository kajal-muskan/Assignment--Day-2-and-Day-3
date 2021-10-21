import java.util.Scanner;

class Employee {

    private int eid;
    private String name;
    private float salary;

     void inputDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Details: ");
        System.out.print("Enter Employee ID: ");
        eid = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        salary = sc.nextFloat();


    }

    void showDetails(){
        System.out.println("Employee Details: ");
        System.out.println("Employee ID: " +eid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);

    }

}

public class EmployeeDetails {

    public static void main (String [] args){
        Employee objEmployee = new Employee();

        objEmployee.inputDetails();
        objEmployee.showDetails();


    }
}
