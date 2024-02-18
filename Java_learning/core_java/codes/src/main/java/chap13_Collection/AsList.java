package chap13_Collection;

import java.util.*;

// Lightweight Collection Wrapper *asList
public class AsList {
    public static void main(String[] args) {
        Item[] items = new Item[10];
        List<Item> itemList = Arrays.asList(items);
        System.out.println(itemList);

        String[] strings = {"a", "b", "c", "d"};
        List<String> stringList = Arrays.asList(strings);
        System.out.println(stringList);

//        copiedStrings is immutable object.
        List<String> copiedStrings = Collections.nCopies(3, "efg");
        System.out.println(copiedStrings);

//        Singleton is unmodifiable, and used to ensure the set only contain a single element.
        Set<String> singleton = Collections.singleton("abc");
    }
}
