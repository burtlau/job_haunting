package chap6_interfaceAndInnerClass;

import org.junit.Test;

import static org.junit.Assert.*;

public class CloneTestTest {
    @Test
    public void cloneCreationTest(){
        Employee original = new Employee("Alice", 50000);
        try {
            Employee cloned = original.clone();
            assertEquals(original.getName(), cloned.getName());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void cloneDifferenceTest(){
        Employee original = new Employee("Alice", 50000);
        try {
            Employee cloned = original.clone();
            cloned.raiseSalary(5);
            assertNotEquals(original.getSalary(), cloned.getSalary());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


}