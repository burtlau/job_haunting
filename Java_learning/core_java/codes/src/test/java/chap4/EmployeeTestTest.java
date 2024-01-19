package chap4;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class EmployeeTestTest {
    @Test
    public void testRaiseSalary() {
        Employee employee = new Employee("John Doe", 50000, 2000, 1, 1);
        employee.raiseSalary(10); // Increase salary by 10%
        assertEquals(55000, employee.getSalary(), 0.01); // Verify the new salary value
    }
}