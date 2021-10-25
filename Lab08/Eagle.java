package Lab08;

import java.security.SecureRandom;

public class Eagle extends Animal{
    @Override
    protected String getName() {
        return "Eagle";
    }

    @Override
    protected boolean getIsFlyAble() {
        return true;
    }

    @Override
    protected double getSpeed() {
        return new SecureRandom().nextInt(60);
    }
}
