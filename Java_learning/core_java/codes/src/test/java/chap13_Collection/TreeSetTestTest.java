package chap13_Collection;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeSetTestTest {
    @Test
    public void testTreeSetTest() {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));

        TreeSetTest.main(new String[0]);
        SortedSet<Item> expectedParts = new TreeSet<>();
        expectedParts.add(new Item("Modem", 9912));
        expectedParts.add(new Item("Toaster", 1234));
        expectedParts.add(new Item("Widget", 4562));
        SortedSet<Item> sortedParts = new TreeSet<>(parts);

        assertEquals(expectedParts, sortedParts);
    }
}
