package Lab08;

import java.security.SecureRandom;

public class Tiger extends Animal{
    @Override
    protected String getName() {
        return "Tiger";
    }

    @Override
    protected boolean getIsFlyAble() {
        return false;
    }

    @Override
    protected double getSpeed() {
        return new SecureRandom().nextInt(130);
    }
}
