public class Main {
    public static void main(String[] args){

        char[] pwdfirst = "PassWD15!!".toCharArray();
        char[] pwdweak = "123456789".toCharArray();
        char[] pwdstrong = "NewPWD16!!".toCharArray();

        Password p = new Password(pwdfirst);

        System.out.println(p.changePassword(pwdfirst,pwdweak));

        pwdfirst[0] = 'p';

        System.out.println(p.changePassword(pwdfirst,pwdstrong));

        pwdfirst[0] = 'P';

        System.out.println(p.changePassword(pwdfirst,pwdstrong));



    }
}
