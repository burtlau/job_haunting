package chap13_Collection;

import java.util.*;


public class SortAndShuffleTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 39; i++) {
            integerList.add(i);
        }
        Collections.shuffle(integerList);
        List<Integer> winningList = integerList.subList(0, 6);
        System.out.println(winningList);
        Collections.sort(winningList);
        System.out.println(winningList);
    }
}
