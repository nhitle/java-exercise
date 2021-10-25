package Lab08;

import java.security.SecureRandom;

public class Squirrel extends Animal{
    @Override
    protected String getName() {
        return "Squirrel";
    }

    @Override
    protected boolean getIsFlyAble() {
        return false;
    }

    @Override
    protected double getSpeed() {
        return new SecureRandom().nextInt(100);
    }
}
