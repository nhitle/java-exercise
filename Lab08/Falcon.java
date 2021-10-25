package Lab08;

import java.security.SecureRandom;

public class Falcon extends Animal{
    @Override
    protected String getName() {
        return "Falcon";
    }

    @Override
    protected boolean getIsFlyAble() {
        return true;
    }

    @Override
    protected double getSpeed() {
        return new SecureRandom().nextInt(75);
    }
}
