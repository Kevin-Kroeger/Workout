import java.util.Random;
import java.util.Scanner;

public class

MultiplicationQuiz {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    private int first = rand.nextInt(20);
    private int second = rand.nextInt(20);
    private String excersice = first +  " * " + second;
    private int result = first * second;

    public String getExcersice(){
        String ret =  "Die Aufgabe lautet:" + excersice;
        return ret;
    }

    public int getResult(){
        return this.result;
    }

    public boolean checkResult(){
        int answer = sc.nextInt();
        if(answer == getResult()){
            return true;
        }else{
            return false;
        }
    }
}
