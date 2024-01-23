package chap5_Inheritance;

import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class ArrayListTestTest {
    @Test
    public void testEmployeeArrayList() {
        ArrayList<Employee> staff = new ArrayList<>();

        // Add some employees to the list
        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Barl Bracker", 75000, 1987, 12, 15));

        // Raise the salaries of employees
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        // Check the values of employees after raising salaries
        assertEquals("Carl Cracker", staff.get(0).getName());
        assertEquals(75000 * 1.05, staff.get(0).getSalary(), 0.01); // Use a delta for double comparison
        assertEquals("Barl Bracker", staff.get(1).getName());
        assertEquals(75000 * 1.05, staff.get(1).getSalary(), 0.01);
    }
}