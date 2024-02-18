package chap13_Collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SortAndShuffleTestTest {
    @Test
    public void uniqueSortedTest() {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 39; i++) {
            newList.add(i);
        }
        Collections.shuffle(newList);
        List<Integer> winningList = newList.subList(0,6);
        Collections.sort(winningList);
//        test the wining list is sorted
        for (int i = 1; i < winningList.size(); i++) {
            assertTrue(winningList.get(i) > winningList.get(i - 1));
        }

//        test the wining list is unique
        Set<Integer> hashSet = new HashSet<>(winningList);
        assertEquals(hashSet.size(), winningList.size());
    }
}