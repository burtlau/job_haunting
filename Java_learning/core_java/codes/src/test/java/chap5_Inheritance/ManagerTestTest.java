package chap5_Inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTestTest {

    @Test
    public void mangerTest(){
        Manager managerA = new Manager("Burt Liu", 50000, 2012,3,1);
        managerA.setBonus(4000);
        assertNotNull(managerA);
        assertEquals("Burt Liu", managerA.getName());
        assertEquals(54000, managerA.getSalary(), 0.01);
    }


}