package Lab5;

public class RobotCat {
    private String name;

    public RobotCat() {
    }

    public RobotCat(String name) {
        this.name = name;
    }
    //Getters
    public String getName() {
        return name;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }
    //Method
    public void run(){
        System.out.println("Running...");
    }
    public void runWithStep (int steps){
        for(int initStep = 0; initStep < steps; initStep++){
            System.out.println("Running at steps: " + (initStep+1));
        }
        toString();
    }
}
