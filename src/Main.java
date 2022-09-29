public class Main {
    public static void main(String[] args){
        Tvremote tv = new Tvremote();

        tv.changeChannelnumber(1);
        tv.changeChannelname("ARD");
        tv.changeChannelnumber(31);
        System.out.println(tv.toString());




    }
}
