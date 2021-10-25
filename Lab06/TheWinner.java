package Lab06;

import java.util.List;

import static sun.swing.MenuItemLayoutHelper.max;

public class TheWinner {
    public static void main(String[] args) {

        Horse horse = new Horse();
        int horseSpeed = horse.getRandomSpeed();
        System.out.println("Horse's Speed:" + horseSpeed);

        Dog dog = new Dog();
        int dogSpeed = dog.getRandomSpeed();
        System.out.println("Dog's Speed:" + dogSpeed);

        Tiger tiger = new Tiger();
        int tigerSpeed = tiger.getRandomSpeed();
        System.out.println("Tiger's Speed:" + tigerSpeed);

        int maxSpeed = 0;
        maxSpeed = max(horseSpeed, dogSpeed, tigerSpeed);
        if (maxSpeed == horseSpeed) {
            System.out.println("Winner is: Horse" + ", with speed is: " + maxSpeed);
        } else if (maxSpeed == dogSpeed) {
            System.out.println("Winner is: Dog" + ", with speed is: " + maxSpeed);

        } else {
            System.out.println("Winner is: Tiger" + ", with speed is: " + maxSpeed);
        }

    }
}
