import java.util.Random;

public class MultiplicationQuiz {
    Random rand = new Random();

    private int first = rand.nextInt(20);
    private int second = rand.nextInt(20);
    private String excersice = first " * " second;
    private int result = first + second;

    public String getExcersice(){
        return String = "Die Aufgabe lautet:" + excersice;
    }

    public int getResult(){
        return this.result;
    }

    public boolean checkResult(int answer){
        if(answer == getResult()){
            return true;
        }else{
            return false;
        }
    }
}
