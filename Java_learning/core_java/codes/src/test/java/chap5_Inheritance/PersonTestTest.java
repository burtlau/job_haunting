package chap5_Inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTestTest {
    @Test
    public void personCreationTest()
    {
        Person[] people = new Person[3];
        people[0] = new Employee("Alice", 30000, 2001, 12,6);
        people[1] = new Employee("Bob", 30000, 2001, 12,6);
        people[2] = new Student("Burt", "Computer Science");

        for (Person p : people)
        {
            assertNotNull(p);
            assert p.getDescription() != null ;
            assert p.getDescription() instanceof String: "The get description produce non string char.";

        }

    }

}