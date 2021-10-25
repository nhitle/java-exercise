package Lab5;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {
    public static void main(String[] args) {
        List<Employees> EmployeeList = new ArrayList<>();
        Employees CEO = new Employees(100000);
        Employees Manager = new Employees(50000);
        Employees StandardEmployee = new Employees(10000);

        EmployeeList.add(CEO);
        EmployeeList.add(Manager);
        EmployeeList.add(StandardEmployee);

        System.out.printf("Sum of salary: %d",CEO.getSalary()+ Manager.getSalary() + 3*StandardEmployee.getSalary());
        }
}
