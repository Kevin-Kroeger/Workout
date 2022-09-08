

public class Bmi{

    public String toString(){
        double height = 1.80;
        double weight = 57.0;

        double bmi = Health.calculateBmi(weight, height);
        String category = Health.bmi(bmi);
        return "Mit einem Bmi von" + bmi + "sind sie" + category;
    }
}
