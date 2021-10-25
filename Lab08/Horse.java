package Lab08;

import java.security.SecureRandom;

public class Horse extends Animal{
    @Override
    protected String getName() {
        return "Horse";
    }

    @Override
    protected boolean getIsFlyAble() {
        return false;
    }

    @Override
    protected double getSpeed() {
        return new SecureRandom().nextInt(90);
    }
}
