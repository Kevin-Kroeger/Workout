import java.util.Scanner;

public class Bmi{
    Scanner sc = new Scanner(System.in);
    Health health = new Health();

    public Bmi(){
    }
    public double scanHeight(){
        return sc.nextDouble();
    }

    public double scanWeight(){
        return sc.nextDouble();
    }

    public String toString(){
        double bmi = health.calculateBmi(scanHeight(), scanWeight());
        String category = health.bmi(bmi);
        return "Mit einem Bmi von" + bmi + "sind sie" + category;
    }
}
