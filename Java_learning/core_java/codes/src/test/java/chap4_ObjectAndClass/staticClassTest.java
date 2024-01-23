package chap4_ObjectAndClass;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class staticClassTest {
    @Test
    public void testEmployeeCreation(){
        StaticEmployee employee = new StaticEmployee("Burt Liu", 75000);
        assertNotNull(employee);
        assertEquals("Burt Liu", employee.getName());
        assertEquals(75000, employee.getSalary(), 0.01);
    }

    @Test
    public void testIdAssignment(){
        StaticEmployee employee1 = new StaticEmployee("Burt Liu", 85000);
        StaticEmployee employee2 = new StaticEmployee("zhongliu Liu", 85000);
        assertEquals(1, employee1.getId());
        assertEquals(2, employee2.getId());
        assertEquals(3, StaticEmployee.getNextId());
    }


}
