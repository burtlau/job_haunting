package chap13_Collection;

import java.util.*;

// Combine with:
// static <T extends Comparable> T max(T[] a)
// static <T extends Comparable> T max(ArrayList[T] v)
// static <T extends Comparable> T max(LinkedList[T] l)

public class MaxTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Alice", "Zed", "Burt", "Cecilia", "Dylan"));
        System.out.println(customMax(linkedList));
    }

    public static <T extends Comparable> T customMax(Collection<T> c)
    {
        if (c.isEmpty()) throw new NoSuchElementException();
        Iterator<T> iter = c.iterator();
        T largest = iter.next();
        while (iter.hasNext())
        {
            T next = iter.next();
            if (largest.compareTo(next) < 0)
                largest = next;
        }
        return largest;
    }
}
