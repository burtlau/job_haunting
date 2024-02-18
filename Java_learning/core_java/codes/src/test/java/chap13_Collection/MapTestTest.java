package chap13_Collection;

import static org.junit.Assert.*;

import chap5_Inheritance.Employee;
import org.junit.jupiter.api.Test;

import java.util.*;


public class MapTestTest {

    @Test
    public void testMapOperations() {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee", 20000, 1900, 1, 1));
        staff.put("567-24-2546", new Employee("Harry Hacker", 20000, 1900, 1, 1));
        staff.put("157-62-7935", new Employee("Gary Cooper", 20000, 1900, 1, 1));
        staff.put("456-62-5527", new Employee("Francesca Cruz", 20000, 1900, 1, 1));


        staff.remove("567-24-2546");
        staff.put("456-62-5527", new Employee("Francesca Miller", 20000, 1900, 1, 1));

        assertNull(staff.get("567-24-2546")); // Verify that the entry is removed.
        assertEquals("Francesca Miller", staff.get("456-62-5527").getName()); // Verify the modified entry.

        assertTrue(staff.containsKey("144-25-5464"));
        assertFalse(staff.containsKey("567-24-2546"));

        assertEquals(3, staff.size());
    }
}
