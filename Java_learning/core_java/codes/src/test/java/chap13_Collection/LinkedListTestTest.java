package chap13_Collection;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTestTest {

    @Test
    public void testLinkedListOperations() {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }

        assertEquals("[Amy, Bob, Carl, Doug, Erica, Frances, Gloria]", a.toString());

        bIter = b.iterator();
        while (bIter.hasNext()) {
            bIter.next();
            if (bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }
        }

        assertEquals("[Bob, Frances]", b.toString());

        a.removeAll(b);

        assertEquals("[Amy, Carl, Doug, Erica, Gloria]", a.toString());
    }
}
