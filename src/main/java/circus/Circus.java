package circus;

import circus.animal.*;
import circus.stuff.Equipment;
import circus.stuff.Cannon;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            printNumberOfAnimals(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                printNumberOfAnimals("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            printNumberOfAnimals("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        animalArrayList.add(new Elephant("Strong one"));
//        printAnimals();
//        printNumberOfAnimals("Number of animals in circus: " + animalArrayList.size());
        Tiger sherKhan = new Tiger("Sher Khan");
        animalArrayList.add(sherKhan);
        Parrot bobby = new Parrot("Bobby");
        animalArrayList.add(bobby);
        System.out.println("position of sher khan: " + animalArrayList.indexOf(sherKhan));
        System.out.println("Before Sorting:");
        printAnimals(animalArrayList);

        animalArrayList.sort(Animal.AnimalNameComparator);
        System.out.println("After Sorting:");
        printAnimals(animalArrayList);
//        makeAnimalsTalk();
//        System.out.println("Total value of animals " + calculateAssetValue(animals));
//        System.out.println("Total value of equipments " + calculateAssetValue(equipments));
    }

    private static void printNumberOfAnimals(String animalArrayList) {
        System.out.println(animalArrayList);
    }

    private static void printAnimals(ArrayList<Animal> animalArrayList) {
        for (Animal a : animalArrayList) {
            System.out.println(a);
        }
    }
}