package Lab5;

import java.util.concurrent.Callable;

public class Caculator {
    public int sum2num(int num1, int num2){
        return num1 + num2;
    }
    public int sum3num(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
    Caculator caculator = new Caculator();
        System.out.println(caculator.sum2num(1,2));
        System.out.println(caculator.sum3num(1,2,3));

            }
        };

