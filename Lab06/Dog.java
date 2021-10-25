package Lab06;

import java.security.SecureRandom;

public class Dog extends Animal {
    public String getDefaultName() {
        if (defaultName == null) {
            return "Dog";
        }
        return defaultName;
    }

    public int getRandomSpeed() {
        int randomSpeed = new SecureRandom().nextInt(60);
        return randomSpeed;
    }
}
