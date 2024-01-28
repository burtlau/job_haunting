package chap12_GenericProgramming;

import chap5_Inheritance.Employee;
import chap5_Inheritance.Manager;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee ma = new Manager("a", 1000, 2000, 1, 1);
        Employee mb = new Manager("b", 1000, 2000, 1, 1);
        Employee ec = new Employee("c", 1000, 2000, 1, 1);
        Employee ed = new Employee("d", 1000, 2000, 1, 1);

        addEmployee(employees, ma);
        addEmployee(employees, mb);
        addEmployee(employees, ec);
        addEmployee(employees, ed);

        System.out.println(employees);
    }

    public static void addEmployee(List<? super Employee> employeeList, Employee employee)
    {
        employeeList.add(employee);
    }
}
