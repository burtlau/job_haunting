package chap12_GenericProgramming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCardTest {
    @Test
    public void printListTest()
    {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        UnboundedWildCard.printList(integerList);

        List<String> stringList = new ArrayList<>();
        stringList.add("I");
        stringList.add("am");
        stringList.add("smart");
        UnboundedWildCard.printList(stringList);

        assert stringList.get(0).equals("I");
        assert stringList.get(1).equals("am");
        assert stringList.get(2).equals("smart");

        assert integerList.get(0).equals(2);
        assert integerList.get(1).equals(3);
        assert integerList.get(2).equals(4);
    }

}