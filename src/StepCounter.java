public class StepCounter {

    private String date;
    private int step;

    //Constructor
    public StepCounter(String pDate){
        setDate(pDate);
        setStep(0);
    }


    //Increases the Steps
    public void incrementSteps(){
        this.step = this.step + 1;
    }

    //toString
    public String toString(){
        String ret =  "Am" + getDate() + "bin Ich " + getSteps() + "Schritte gegangen";
        return ret;
    }


    //Getter + Setter
    public void setDate(String pDate){
        this.date = pDate;
    }

    public void setStep(int pStep){
        this.step = pStep;
    }

    public String getDate(){
        return this.date;
    }

    public int getSteps(){
        return this.step;
    }


}
