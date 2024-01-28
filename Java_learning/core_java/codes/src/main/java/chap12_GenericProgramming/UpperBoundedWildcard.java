package chap12_GenericProgramming;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcard {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Quick"));
        animals.add(new Cat("Daphne"));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Quick"));

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Daphne"));

        printAnimals(animals);
        printAnimals(dogs);
        printAnimals(cats);
    }

    public static void printAnimals(List<? extends Animal> animalList)
    {
        for (Animal animal : animalList)
        {
            animal.speak();
        }
    }
}
abstract class Animal {
    private String name;
    public Animal(String Aname)
    {
        name = Aname;
    }
    void speak()
    {
        System.out.println("Animal speaks.");
    }
}

class Dog extends Animal{
    public Dog(String Aname) {
        super(Aname);
    }
    @Override
    void speak() {
        System.out.println("Dog goes bark.");
    }
}

class Cat extends Animal{
    public Cat(String Aname) {
        super(Aname);
    }
    @Override
    void speak() {
        System.out.println("Cat goes meow.");
    }
}
