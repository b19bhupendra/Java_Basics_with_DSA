package task2;

import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    // Attributes
    int id;
    String name;
    double salary;

    // Constructor to initialize Employee object
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("------------------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(1, "Bhupendra", 50000);
        Employee emp2 = new Employee(2, "Rohit", 60000);
        Employee emp3 = new Employee(3, "Virat", 55000);

        // Storing employees in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Displaying employee details
        System.out.println("Employee Details:");
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
