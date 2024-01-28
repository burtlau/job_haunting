package chap12_GenericProgramming;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCard {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");

        List<Integer> integers = new ArrayList<>();
        integers.add(-1);
        integers.add(10);
        integers.add(3);

        printList(strings);
        printList(integers);
    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
