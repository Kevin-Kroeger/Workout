public class Health {



    public static double calculateBmi(double pWeight, double pHeight){
        return pWeight * (pHeight * pHeight);
    }

    public static String bmi(double pBmi){
        String ret = "";
        if(pBmi < 18.5){
            ret = ret + "untergewichtig";
        }else if(pBmi < 25.0 && pBmi > 18.5){
            ret = ret + "normalgewichtig";
        }else if(pBmi < 30.0 && pBmi > 25.0){
            ret = ret + "übergewichtig";
        }else{
            ret = ret + "fettleibig";
        }
        return ret;
    }
}
