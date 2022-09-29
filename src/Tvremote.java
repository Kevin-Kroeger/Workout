public class Tvremote {
    private String[] channel = new String[30];
    private int channelnumber = 0;

    public Tvremote(){
        numberforChannel();
    }


    public void numberforChannel(){
        for(int i = 0; i < channel.length; i++){
            channel[i] = String.valueOf(i);
        }
    }


    public void changeChannelname(String name){
        this.channel[channelnumber] = name;
    }

    /**
     * Method to change channelnumber with the param number
     * @param number
     */
    public void changeChannelnumber(int number){
        for(int i = 0; i < number ; i++) {
            channelnumber++;
            System.out.println(channelnumber);
            if (channelnumber > this.channel.length) {
                channelnumber = 0;
            }
        }
    }

    public String toString(){
        return this.channel[channelnumber];
    }

    /**
     * return channelnumber
     * @return
     */
    public int getChannelnumber() {
        return channelnumber;
    }

    /**
     * Set channelnumber
     * @param channelnumber
     */
    public void setChannelnumber(int channelnumber) {
        this.channelnumber = channelnumber;
    }


    /**
     * return channel
     * @return
     */
    public String[] getChannel() {
        return channel;
    }

    /**
     * Setchannel
     * @param channel
     */
    public void setChannel(String[] channel) {
        this.channel = channel;
    }
}
