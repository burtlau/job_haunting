package chap13_Collection;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriorityQueueTestTest {

    @Test
    public void testPriorityQueue() {
        PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();
        pq.add(new GregorianCalendar(1906, Calendar.DECEMBER, 9));
        pq.add(new GregorianCalendar(1815, Calendar.DECEMBER, 10));
        pq.add(new GregorianCalendar(1903, Calendar.DECEMBER, 3));
        pq.add(new GregorianCalendar(1910, Calendar.JUNE, 22));

        StringBuilder resultBuilder = new StringBuilder();
        while (!pq.isEmpty()) {
            resultBuilder.append(pq.remove().get(Calendar.YEAR)).append(" ");
        }
        String actualResult = resultBuilder.toString().trim();

        String expectedResult = "1815 1903 1906 1910";
        assertEquals(expectedResult, actualResult);
    }
}
