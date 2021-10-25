package Lab5;

public class TestRobotCat {
    public static void main(String[] args){
       RobotCat robotCat = new RobotCat();
       RobotCat mimi = new RobotCat("mimi");
        System.out.println("Cat's name: " + mimi.getName());
        mimi.setName("Doremon");
        System.out.println("Cat's name: " + mimi.getName());
        mimi.run();
        mimi.runWithStep(3);

        System.out.println(mimi);
    }
}
