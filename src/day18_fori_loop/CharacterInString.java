package day18_fori_loop;

public class CharacterInString {
    public static void main(String[] args) {

        String str = "Java";

        for (int i = 0; i < str.length(); i++) {
           // int numChar = str.charAt(i);
            //System.out.println(numChar);
            System.out.println((int)str.charAt(i));
        }
    }
}
