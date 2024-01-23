package chap6_interfaceAndInnerClass;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void compareTest () {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Alice", 100);
        staff[1] = new Employee("Alice", 50);
        staff[2] = new Employee("Chloe", 2000);
        Arrays.sort(staff);
        assertTrue(staff[1].getSalary() > staff[0].getSalary());
        assertTrue(staff[2].getSalary() > staff[1].getSalary());

    }

}