public class Health {

    public static String getBmi(float pBmi){
        String ret = "";
        if(pBmi < 18.5){
            ret = ret + "untergewichtig";
        }else if(pBmi < 25){
            ret = ret + "normalgewichtig";
        }else if(pBmi < 30){
            ret = ret + "übergewichtig";
        }else{
            ret = ret + "fettleibig";
        }
        return ret;
    }

    public static float computeBMI(float pWeigth, float pHeigth){
        float bmi = (pWeigth / (pHeigth * pHeigth));
        return bmi;
    }

}
