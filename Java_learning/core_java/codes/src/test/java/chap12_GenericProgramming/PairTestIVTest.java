package chap12_GenericProgramming;

import chap5_Inheritance.Employee;
import chap5_Inheritance.Manager;
import org.junit.Test;

import static org.junit.Assert.*;

public class PairTestIVTest {
    @Test
    public void printBuddiesTest() {
        Manager ceo = new Manager("Gus Greedy", 800000, 2003, 12, 15);
        Manager cfo = new Manager("Sid Sneaky", 600000, 2003, 12, 15);
        Pair<Manager> buddies = new Pair<>(ceo, cfo);

        String expected = "Gus Greedy and Sid Sneaky are buddies.";
        String actual = PairTestIV.printBuddies(buddies);

        assertEquals(expected, actual);
    }

    @Test
    public void minmaxBonusTest() {
        Manager ceo = new Manager("Gus Greedy", 800000, 2003, 12, 15);
        Manager cfo = new Manager("Sid Sneaky", 600000, 2003, 12, 15);
        Manager[] managers = {ceo, cfo};
        Pair<Manager> result = new Pair<>();
        ceo.setBonus(1000000);
        cfo.setBonus(500000);
        PairTestIV.minmaxBonus(managers, result);

        assertEquals("Sid Sneaky", result.getFirst().getName());
        assertEquals("Gus Greedy", result.getSecond().getName());
    }

    @Test
    public void maxminBonusTest() {
        Manager ceo = new Manager("Gus Greedy", 800000, 2003, 12, 15);
        Manager cfo = new Manager("Sid Sneaky", 600000, 2003, 12, 15);
        Manager[] managers = {ceo, cfo};
        Pair<Employee> result = new Pair<>();
        ceo.setBonus(1000000);
        cfo.setBonus(500000);
        PairTestIV.maxminBonus(managers, result);

        assertEquals("Gus Greedy", result.getFirst().getName());
        assertEquals("Sid Sneaky", result.getSecond().getName());
    }

}