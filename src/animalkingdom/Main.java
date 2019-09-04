package animalkingdom;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    // Animal List
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigFoot = new Mammal("BigFoot", 2021);

        // Bird List
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // Fish list
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("CatFish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // creating an arrlist and manually adding them
        ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();

        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigFoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        //The expressions

        // 1
        System.out.println("Decending by year named");
        // sort
        animalList.sort((a1, a2) -> a2.getYearNamed() - a1.getYearNamed());
        // map
        animalList.forEach(animal -> System.out.println(animal.getName() + ": " + animal.getYearNamed()));

        // 2
        System.out.println();
        System.out.println("Alphabetically");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach(animal -> System.out.println(animal.getName()));

        // 3
        System.out.println();
        System.out.println("By how they move");
        animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalList.forEach(animal -> System.out.println(animal.getName() + ": " + animal.move()));

        // 4
        System.out.println();
        System.out.println("Animals that breath with lungs");
        printAnimals(animalList, animal -> animal.breath().equals("Draws air deep into their lungs."));

        // 5
        System.out.println();
        System.out.println("Breaths with lungs and named in 1758");
        printAnimals(animalList, animal -> animal.breath().equals("Draws air deep into their lungs.") && animal.getYearNamed() == 1758);

        // 6
        System.out.println();
        System.out.println("Lays eggs and breaths with lungs");
        printAnimals(animalList, animal -> animal.breath().equals("Draws air deep into their lungs.") && animal.reproduce().equals("Had a healthy clutch of eggs."));

        // 7
        System.out.println();
        System.out.println("Listed alphabetically and were named in 1758");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalList, animal -> animal.getYearNamed() == 1758);
    }
}