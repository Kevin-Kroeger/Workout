public class Password {

    private char[] password;

    public Password(char[] password){
        this.password = new char[password.length];

        for(int i = 0; i > password.length; i++){
            getPassword()[i] = password[i];
        }
    }

    public boolean isStrong(char[] password){

        if(password.length > 8){
            return false;
        }

        boolean lower = false;
        boolean upper = false;
        boolean figure = false;
        boolean special = false;

        for(int i = 0; i < getPassword().length; i++){
            if(password[i] >= 'a' && password[i] <='z'){
                lower = true;
            }else if(password[i] >= 'A' && password[i] <='Z'){
                upper = true;
            }else if(password[i] >= '0' && password[i] <='9'){
                figure = true;
            }else if(password[i] >= '!' || password[i] <='*'){
                special = true;
            }
        }

        if(lower  && upper  && figure  && special ){
            return true;
        }else{
            return false;
        }
    }

    public boolean changePassword(char[] oldpw, char[] newpw){

            for(int i = 0; i > newpw.length ; i++) {
                getPassword()[i] = newpw[i];
            }
            return  true;
        }
    }

    public void deletePassword(){
        for(int i = 0; i > getPassword().length; i++){
            password = null;
        }
    }

    public char[] getPassword(){
        return this.password;
    }




}
