package chap12_GenericProgramming;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpperBoundedWildcardTest {

    @Test
    public void testPrintAnimals() {
        class Fish extends Animal
        {

            public Fish(String Aname) {
                super(Aname);
            }

            @Override
            void speak() {
                System.out.println("Fish goes bruh");
            }
        }

        List<Animal> animals = new ArrayList<>();
        animals.add(new Fish("Mimo"));
        assertDoesNotThrow(() -> {
            UpperBoundedWildcard.printAnimals(animals);
        });

    }
}
