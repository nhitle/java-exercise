package Lab08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalToRace {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal horse = new Horse();
        Animal eagle = new Eagle();
        Animal falcon = new Falcon();
        Animal tiger = new Tiger();
        Animal squirrel = new Squirrel();

        animals.add(horse);
        animals.add(eagle);
        animals.add(falcon);
        animals.add(tiger);
        animals.add(squirrel);

        Animal winner = getTheWinner(Arrays.asList(horse, eagle, falcon,tiger,squirrel));
        System.out.println("The winner is: " + winner.getName());
    }

    private static Animal getTheWinner(List<Animal> animals) {
        Animal winner = null;
        for (Animal animal : animals) {
            if (!animal.getIsFlyAble()) {
                System.out.println(animal.getName() + " You can race");
                if (winner == null) {
                    winner = animal;
                } else if (winner.getSpeed() < animal.getSpeed()) {
                    winner = animal;
                }
            } else {
                System.out.println(animal.getName() + " You cannot race!");
            }
        }

        return winner;
    }
}