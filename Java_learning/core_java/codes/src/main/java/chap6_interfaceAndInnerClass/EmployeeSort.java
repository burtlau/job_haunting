package chap6_interfaceAndInnerClass;
import java.util.*;


public class EmployeeSort {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000);
        staff[1] = new Employee("Harry Hacker", 50000);
        staff[2] = new Employee("Tony Tester", 40000);

        Arrays.sort(staff);
        for (Employee e: staff)
        {
            System.out.println("name=" + e.getName() + " ,salary=" + e.getSalary());
        }

    }
}

