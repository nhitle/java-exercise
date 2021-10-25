package Lab072;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class AnimalToRace {
    //Controller
    public static Animal getTheWinner(List<Animal> animals) {
        Animal winner = null;
        String name;
        for (Animal animal : animals) {
            if (animal.getIsAllowToRace()) {
                System.out.println(animal.getName() + "You can race!");
                if (winner == null) {
                    winner = animal;
                } else if (winner.getSpeed() < animal.getSpeed()) {
                    winner = animal;
                }
            } else {
                System.out.println(animal.getName() + "You cannot race!");
            }

        }
        return winner;
    }


        public static void main(String[] args){
            Animal horse = new Animal.AnimalBuilder().name("Horse").speed(new SecureRandom().nextInt(75)).isFlyAble(false).isAllowToRace(true).build();
            Animal tiger = new Animal.AnimalBuilder().name("Tiger").speed(new SecureRandom().nextInt(100)).isFlyAble(false).isAllowToRace(true).build();
            Animal dog = new Animal.AnimalBuilder().name("Dog").speed(new SecureRandom().nextInt(50)).isFlyAble(false).isAllowToRace(true).build();
            Animal goose = new Animal.AnimalBuilder().name("Goose").speed(new SecureRandom().nextInt(25)).isFlyAble(false).isAllowToRace(true).build();
            Animal eagle = new Animal.AnimalBuilder().name("Eagle").speed(new SecureRandom().nextInt(30)).isFlyAble(true).isAllowToRace(true).build();
            Animal falcon = new Animal.AnimalBuilder().name("Falcon").speed(new SecureRandom().nextInt(15)).isFlyAble(true).isAllowToRace(true).build();


            Animal winner = getTheWinner(Arrays.asList(horse, tiger, dog, goose, eagle, falcon));


            System.out.println("The winner is: " + winner.getName());
        }


    }

