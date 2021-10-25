package Lab072;

public class Animal {
    private final String name;
    private final boolean isFlyAble;
    private final boolean isAllowToRace;
    private final int speed;

    private Animal(AnimalBuilder animalBuilder) {
        this.name = animalBuilder.name;
        this.isFlyAble = animalBuilder.isFlyAble;
        this.isAllowToRace = animalBuilder.isAllowToRace;
        this.speed = animalBuilder.speed;
    }


    public String getName() {
        return this.name;
    }


    public boolean getIsAllowToRace() {
        if (!this.isFlyAble) {
            return this.isAllowToRace;
        } else {
            return false;
        }
    }

    public int getSpeed() {
        return speed;
    }


    //Inner Class
    public static class AnimalBuilder {


        private String name;
        private int speed;
        private boolean isFlyAble;
        private boolean isAllowToRace;

        public AnimalBuilder() {

        }

        public AnimalBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public AnimalBuilder isFlyAble(Boolean isFlyAble) {
            this.isFlyAble = isFlyAble;
            return this;
        }

        public AnimalBuilder isAllowToRace(Boolean isAllowToRace){
            this.isAllowToRace = isAllowToRace;
            return this;
        }

        public Animal build() {

            return new Animal(this);
        }

    }
}

