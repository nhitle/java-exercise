package Lab5;

import java.util.ArrayList;
import java.util.List;

public class TestRotbotCat2 {
    public static void main(String[] args) {
        List<RobotCat> robotCatList = new ArrayList<>();
        RobotCat cat1 = new RobotCat("mimi");
        RobotCat cat2 = new RobotCat("momo");
        RobotCat cat3 = new RobotCat("mumu");

        robotCatList.add(cat1);
        robotCatList.add(cat2);
        robotCatList.add(cat3);
        for(RobotCat robotCat : robotCatList){
            System.out.println("Robot Cat name: " + robotCat.getName());
        }
       // mimi.setName("Meomeo");
        robotCatList.get(1).setName("Doremon");
        for(RobotCat robotCat : robotCatList){
            System.out.println("Robot Cat name: " + robotCat.getName());
        }
    }
}
