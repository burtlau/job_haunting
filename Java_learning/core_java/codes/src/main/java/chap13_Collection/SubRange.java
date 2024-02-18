package chap13_Collection;

import java.util.*;

public class SubRange {
    public static void main(String[] args) {
//        List
        Integer[] array = {1, 5, 9, 11};
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(array));
        List<Integer> subList = list.subList(1, 4);
        System.out.println("sublist= " + subList);
        System.out.println();

//        SortedSet
        SortedSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(1, 5, 9, 11));
        SortedSet<Integer> subSortedSet = sortedSet.subSet(5, 12);
        System.out.println("subSortedSet= " + subSortedSet);
        SortedSet<Integer> headSortedSet = sortedSet.headSet(6);
        System.out.println("headSortedSet= " + headSortedSet);
        SortedSet<Integer> tailSortedSet = sortedSet.tailSet(4);
        System.out.println("headSortedSet= " + tailSortedSet);
        System.out.println();

//        NavigableSet
        NavigableSet<Integer> navigableSet = new TreeSet<>(Arrays.asList(1, 5, 9, 11));
        NavigableSet<Integer> subNavigableSet = navigableSet.subSet(1, true, 9, false);
        System.out.println("subNavigableSet= " + subNavigableSet);
        System.out.println("ceiling for 5 in Navigable set = " + navigableSet.ceiling(5));
        System.out.println("floor for 5 in Navigable set = " + navigableSet.floor(5));
        System.out.println("higher for 5 in Navigable set = " + navigableSet.higher(5));
        System.out.println("lower for 5 in Navigable set = " + navigableSet.lower(5));

//        SortedMap
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(1, "one");
        sortedMap.put(5, "five");
        sortedMap.put(9, "nine");
        sortedMap.put(11, "eleven");
        SortedMap<Integer, String> subSortedMap = sortedMap.subMap(5, 12);
        System.out.println("subSortedMap= " + subSortedMap);
        System.out.println("sortedHeadMap of 9= " + sortedMap.headMap(9));
        System.out.println("sortedTailMap of 5= " + sortedMap.tailMap(5));


//        NavigableMap
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "one");
        navigableMap.put(5, "five");
        navigableMap.put(9, "nine");
        navigableMap.put(11, "eleven");
        NavigableMap<Integer, String> subNavigableMap = navigableMap.subMap(5, false, 12, true);
        System.out.println("subNavigableMap= " + subNavigableMap);
        System.out.println("sortedHeadNavigableMap of 9= " + navigableMap.headMap(9));
        System.out.println("sortedTailNavigableMap of 5= " + navigableMap.tailMap(5));
    }
}
