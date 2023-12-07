package zipcode;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    Character cs;
    Character cf;

    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return "";
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {
        int rotateBy = c - s.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char current;
            if(s.charAt(i) + rotateBy > 90){
                current = (char) ((s.charAt(i) + rotateBy) - 26);
            }
            else {
                current = (char) (s.charAt(i) + rotateBy);
            }
            sb.append(current);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

}
