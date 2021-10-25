package Lab06;

public class Animal {
    protected static String defaultName;
    protected static int randomSpeed;

    public Animal() {
    }

    public Animal(String defaultName, int randomSpeed) {
        this.defaultName = defaultName;
        this.randomSpeed = randomSpeed;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    public int getRandomSpeed() {
        return randomSpeed;
    }

    public void setRandomSpeed(int randomSpeed) {
        this.randomSpeed = randomSpeed;
    }
}
