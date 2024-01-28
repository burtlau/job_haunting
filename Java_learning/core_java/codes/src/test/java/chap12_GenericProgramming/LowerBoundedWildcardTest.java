package chap12_GenericProgramming;

import chap5_Inheritance.Employee;
import chap5_Inheritance.Manager;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LowerBoundedWildcardTest {
    @Test
    public void testAddEmployee() {
        List<Employee> employees = new ArrayList<>();
        Employee ma = new Manager("a", 1000, 2000, 1, 1);
        Employee mb = new Manager("b", 1000, 2000, 1, 1);
        Employee ec = new Employee("c", 1000, 2000, 1, 1);
        Employee ed = new Employee("d", 1000, 2000, 1, 1);
        LowerBoundedWildcard.addEmployee(employees, ma);
        LowerBoundedWildcard.addEmployee(employees, mb);
        LowerBoundedWildcard.addEmployee(employees, ec);
        LowerBoundedWildcard.addEmployee(employees, ed);

        assertEquals(4, employees.size());
        assertEquals(ma, employees.get(0));
        assertEquals(mb, employees.get(1));
        assertEquals(ec, employees.get(2));
        assertEquals(ed, employees.get(3));
    }

}