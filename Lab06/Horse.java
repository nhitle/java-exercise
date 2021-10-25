package Lab06;

import java.security.SecureRandom;

public class Horse extends Animal {
    public String getDefaultName() {
        if (defaultName == null) {
            return "Horse";
        }
        return defaultName;
    }

    public int getRandomSpeed() {
        int randomSpeed = new SecureRandom().nextInt(75);
        return randomSpeed;
    }
}
