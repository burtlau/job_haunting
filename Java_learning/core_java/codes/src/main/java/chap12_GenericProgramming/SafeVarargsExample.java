package chap12_GeneralProgramming;

import java.util.ArrayList;
import java.util.List;

public class SafeVarargsExample {
    public static void main(String[] args) {
        List<String> list1 = createList("Apple", "Banana", "Cherry");
        List<Integer> list2 = createList(1, 2, 3, 4, 5);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
    }

    @SafeVarargs
    public static <T> List<T> createList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }
}
