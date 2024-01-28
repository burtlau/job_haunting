package chap12_GenericProgramming;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SafeVarargsExampleTest {
    @Test
    public void testCreateListWithStrings(){
        List<String> list = SafeVarargsExample.createList("Apple", "Banana", "Cherry");
        assertEquals(3, list.size());
        assertEquals("Apple", list.get(0));
        assertEquals("Banana", list.get(1));
        assertEquals("Cherry", list.get(2));
    }

    @Test
    public void testCreateListWithNoArguments() {
        List<Object> list = SafeVarargsExample.createList();
        assertEquals(0, list.size());
    }

}