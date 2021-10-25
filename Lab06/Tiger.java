package Lab06;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public String getDefaultName() {
        if (defaultName == null) {
            return "Tiger";
        }
        return defaultName;
    }

    public int getRandomSpeed() {
        int randomSpeed = new SecureRandom().nextInt(100);
        return randomSpeed;
    }
}
