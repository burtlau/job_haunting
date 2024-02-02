package chap13_Collection;

import java.util.*;

public class CollectionAlgorithm {
    public static void main(String[] args) {
//      Collections.copy (need size >= original )
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1,21,0,-2,4,10));
        List<Integer> copiedList = new ArrayList<>(Collections.nCopies(integerList.size(), 1));
        Collections.copy(copiedList, integerList);
        System.out.println(copiedList);

//      Collections.fill
        Collections.fill(copiedList, 1);
        System.out.println(copiedList);

//      Collections.addAll
        boolean result = copiedList.addAll(integerList);
        System.out.println(copiedList);

//      Collections.replaceAll
        Collections.replaceAll(copiedList, 1,2);
        System.out.println(copiedList);

//      Collections.reverse
        Collections.reverse(copiedList);
        System.out.println(copiedList);

//      Collections.rotate
        Collections.rotate(copiedList, 2);
        System.out.println(copiedList);

//      Collections.frequency
        System.out.println(Collections.frequency(copiedList, 2));

//      Collections.disjoint
        System.out.println(Collections.disjoint(integerList, copiedList));
    }
}
